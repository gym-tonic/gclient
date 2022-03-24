package com.graylog.gclient.sender;

import com.graylog.gclient.mapper.GelfMapper;
import com.graylog.gclient.parser.dto.LogDto;
import com.graylog.gclient.sender.dto.GelfDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GelfSender {
    private MyWebClient<GelfDto> webClient;

    @Autowired
    public GelfSender(MyWebClient webClient) {
        this.webClient = webClient;
    }

    public void sendLines(List<LogDto> lines) {
        lines.stream().forEach(line -> webClient.post(GelfMapper.map(line), GelfDto.class));
    }

}
