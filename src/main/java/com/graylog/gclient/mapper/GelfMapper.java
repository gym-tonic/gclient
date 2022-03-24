package com.graylog.gclient.mapper;

import com.graylog.gclient.parser.dto.LogDto;
import com.graylog.gclient.sender.dto.GelfDto;

import java.sql.Timestamp;
import java.time.Instant;

public class GelfMapper {

    public static GelfDto map(LogDto logLine) {
        GelfDto gelfDto = new GelfDto();
        gelfDto.setVersion("1.1");
        gelfDto.setHost("george's PC");
        gelfDto.setFull_message("Full message");
        gelfDto.setShort_message("Short message");
        gelfDto.setTimestamp(Timestamp.from(Instant.now()));
        gelfDto.setLevel(1);
        gelfDto.setClientDeviceType(logLine.getClientDeviceType());
        gelfDto.setClientIP(logLine.getClientIP());
        gelfDto.setClientIPClass(logLine.getClientIPClass());
        gelfDto.setClientStatus(logLine.getClientStatus());
        gelfDto.setClientRequestBytes(logLine.getClientRequestBytes());
        gelfDto.setClientRequestReferer(logLine.getClientRequestReferer());
        gelfDto.setClientRequestURI(logLine.getClientRequestURI());
        gelfDto.setClientRequestUserAgent(logLine.getClientRequestUserAgent());
        gelfDto.setClientSrcPort(logLine.getClientSrcPort());
        gelfDto.setEdgeServerIP(logLine.getEdgeServerIP());
        gelfDto.setEdgeStartTimestamp(logLine.getEdgeStartTimestamp());
        gelfDto.setDestinationIP(logLine.getDestinationIP());
        gelfDto.setOriginResponseBytes(logLine.getOriginResponseBytes());
        gelfDto.setOriginResponseTime(logLine.getOriginResponseTime());
        gelfDto.set_user_id(1l);
        gelfDto.set_some_info("some info");
        gelfDto.set_some_env_var("some env");
        return gelfDto;
    }

}
