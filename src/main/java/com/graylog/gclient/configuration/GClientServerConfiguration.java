package com.graylog.gclient.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "graylog")
public class GClientServerConfiguration {
    private String applicationHostname;
    private Integer applicationPort;

    public String getApplicationHostname() {
        return applicationHostname;
    }

    public void setApplicationHostname(String applicationHostname) {
        this.applicationHostname = applicationHostname;
    }

    public Integer getApplicationPort() {
        return applicationPort;
    }

    public void setApplicationPort(Integer applicationPort) {
        this.applicationPort = applicationPort;
    }
}
