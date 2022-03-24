package com.graylog.gclient.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.graylog.gclient.parser.dto.LogDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

@Service
public class GraylogInputParser {
    private static final Logger LOG = LoggerFactory.getLogger(GraylogInputParser.class);
    private ObjectMapper objectMapper;

    @Autowired
    public GraylogInputParser(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public List<LogDto> readFileFromPath(String path) {
        List<LogDto> lines = new ArrayList<>();
        BufferedReader in = null;
        try {
            in = new BufferedReader(new InputStreamReader(new FileInputStream(path), StandardCharsets.UTF_8));
            String line;
            while ((line = in.readLine()) != null) {
                lines.add(objectMapper.readValue(line, LogDto.class));
            }
        } catch (final IOException e) {
            LOG.error("Error reading file {} ; {}", path, e);
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                LOG.error("Error closing file stream {}", path);
            }
        }
        return lines;
    }
}
