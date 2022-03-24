package com.graylog.gclient.parser.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class LogDto {
    @JsonProperty("ClientDeviceType")
    private String clientDeviceType;
    @JsonProperty("ClientIP")
    private String clientIP;
    @JsonProperty("ClientIPClass")
    private String clientIPClass;
    @JsonProperty("ClientStatus")
    private Long clientStatus;
    @JsonProperty("ClientRequestBytes")
    private Long clientRequestBytes;
    @JsonProperty("ClientRequestReferer")
    private String clientRequestReferer;
    @JsonProperty("ClientRequestURI")
    private String clientRequestURI;
    @JsonProperty("ClientRequestUserAgent")
    private String clientRequestUserAgent;
    @JsonProperty("ClientSrcPort")
    private Long clientSrcPort;
    @JsonProperty("EdgeServerIP")
    private String edgeServerIP;
    @JsonProperty("EdgeStartTimestamp")
    private Timestamp edgeStartTimestamp;
    @JsonProperty("DestinationIP")
    private String destinationIP;
    @JsonProperty("OriginResponseBytes")
    private Long originResponseBytes;
    @JsonProperty("OriginResponseTime")
    private Long originResponseTime;

    public String getClientDeviceType() {
        return clientDeviceType;
    }

    public void setClientDeviceType(String clientDeviceType) {
        this.clientDeviceType = clientDeviceType;
    }

    public String getClientIP() {
        return clientIP;
    }

    public void setClientIP(String clientIP) {
        this.clientIP = clientIP;
    }

    public String getClientIPClass() {
        return clientIPClass;
    }

    public void setClientIPClass(String clientIPClass) {
        this.clientIPClass = clientIPClass;
    }

    public Long getClientStatus() {
        return clientStatus;
    }

    public void setClientStatus(Long clientStatus) {
        this.clientStatus = clientStatus;
    }

    public Long getClientRequestBytes() {
        return clientRequestBytes;
    }

    public void setClientRequestBytes(Long clientRequestBytes) {
        this.clientRequestBytes = clientRequestBytes;
    }

    public String getClientRequestReferer() {
        return clientRequestReferer;
    }

    public void setClientRequestReferer(String clientRequestReferer) {
        this.clientRequestReferer = clientRequestReferer;
    }

    public String getClientRequestURI() {
        return clientRequestURI;
    }

    public void setClientRequestURI(String clientRequestURI) {
        this.clientRequestURI = clientRequestURI;
    }

    public String getClientRequestUserAgent() {
        return clientRequestUserAgent;
    }

    public void setClientRequestUserAgent(String clientRequestUserAgent) {
        this.clientRequestUserAgent = clientRequestUserAgent;
    }

    public Long getClientSrcPort() {
        return clientSrcPort;
    }

    public void setClientSrcPort(Long clientSrcPort) {
        this.clientSrcPort = clientSrcPort;
    }

    public String getEdgeServerIP() {
        return edgeServerIP;
    }

    public void setEdgeServerIP(String edgeServerIP) {
        this.edgeServerIP = edgeServerIP;
    }

    public Timestamp getEdgeStartTimestamp() {
        return edgeStartTimestamp;
    }

    public void setEdgeStartTimestamp(Timestamp edgeStartTimestamp) {
        this.edgeStartTimestamp = edgeStartTimestamp;
    }

    public String getDestinationIP() {
        return destinationIP;
    }

    public void setDestinationIP(String destinationIP) {
        this.destinationIP = destinationIP;
    }

    public Long getOriginResponseBytes() {
        return originResponseBytes;
    }

    public void setOriginResponseBytes(Long originResponseBytes) {
        this.originResponseBytes = originResponseBytes;
    }

    public Long getOriginResponseTime() {
        return originResponseTime;
    }

    public void setOriginResponseTime(Long originResponseTime) {
        this.originResponseTime = originResponseTime;
    }
}
