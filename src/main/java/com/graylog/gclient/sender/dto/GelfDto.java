package com.graylog.gclient.sender.dto;

import java.sql.Timestamp;

public class GelfDto {
    private String version;
    private String host;
    private String short_message;
    private String full_message;
    private Timestamp timestamp;
    private Integer level = 1;
    private String clientDeviceType;
    private String clientIP;
    private String clientIPClass;
    private Long clientStatus;
    private Long clientRequestBytes;
    private String clientRequestReferer;
    private String clientRequestURI;
    private String clientRequestUserAgent;
    private Long clientSrcPort;
    private String edgeServerIP;
    private Timestamp edgeStartTimestamp;
    private String destinationIP;
    private Long originResponseBytes;
    private Long originResponseTime;
    private Long _user_id;
    private String _some_info;
    private String _some_env_var;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getShort_message() {
        return short_message;
    }

    public void setShort_message(String short_message) {
        this.short_message = short_message;
    }

    public String getFull_message() {
        return full_message;
    }

    public void setFull_message(String full_message) {
        this.full_message = full_message;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

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

    public Long get_user_id() {
        return _user_id;
    }

    public void set_user_id(Long _user_id) {
        this._user_id = _user_id;
    }

    public String get_some_info() {
        return _some_info;
    }

    public void set_some_info(String _some_info) {
        this._some_info = _some_info;
    }

    public String get_some_env_var() {
        return _some_env_var;
    }

    public void set_some_env_var(String _some_env_var) {
        this._some_env_var = _some_env_var;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GelfDto gelfDto = (GelfDto) o;

        if (version != null ? !version.equals(gelfDto.version) : gelfDto.version != null) return false;
        if (host != null ? !host.equals(gelfDto.host) : gelfDto.host != null) return false;
        if (short_message != null ? !short_message.equals(gelfDto.short_message) : gelfDto.short_message != null)
            return false;
        if (full_message != null ? !full_message.equals(gelfDto.full_message) : gelfDto.full_message != null)
            return false;
        if (timestamp != null ? !timestamp.equals(gelfDto.timestamp) : gelfDto.timestamp != null) return false;
        if (level != null ? !level.equals(gelfDto.level) : gelfDto.level != null) return false;
        if (clientDeviceType != null ? !clientDeviceType.equals(gelfDto.clientDeviceType) : gelfDto.clientDeviceType != null)
            return false;
        if (clientIP != null ? !clientIP.equals(gelfDto.clientIP) : gelfDto.clientIP != null) return false;
        if (clientIPClass != null ? !clientIPClass.equals(gelfDto.clientIPClass) : gelfDto.clientIPClass != null)
            return false;
        if (clientStatus != null ? !clientStatus.equals(gelfDto.clientStatus) : gelfDto.clientStatus != null)
            return false;
        if (clientRequestBytes != null ? !clientRequestBytes.equals(gelfDto.clientRequestBytes) : gelfDto.clientRequestBytes != null)
            return false;
        if (clientRequestReferer != null ? !clientRequestReferer.equals(gelfDto.clientRequestReferer) : gelfDto.clientRequestReferer != null)
            return false;
        if (clientRequestURI != null ? !clientRequestURI.equals(gelfDto.clientRequestURI) : gelfDto.clientRequestURI != null)
            return false;
        if (clientRequestUserAgent != null ? !clientRequestUserAgent.equals(gelfDto.clientRequestUserAgent) : gelfDto.clientRequestUserAgent != null)
            return false;
        if (clientSrcPort != null ? !clientSrcPort.equals(gelfDto.clientSrcPort) : gelfDto.clientSrcPort != null)
            return false;
        if (edgeServerIP != null ? !edgeServerIP.equals(gelfDto.edgeServerIP) : gelfDto.edgeServerIP != null)
            return false;
        if (edgeStartTimestamp != null ? !edgeStartTimestamp.equals(gelfDto.edgeStartTimestamp) : gelfDto.edgeStartTimestamp != null)
            return false;
        if (destinationIP != null ? !destinationIP.equals(gelfDto.destinationIP) : gelfDto.destinationIP != null)
            return false;
        if (originResponseBytes != null ? !originResponseBytes.equals(gelfDto.originResponseBytes) : gelfDto.originResponseBytes != null)
            return false;
        if (originResponseTime != null ? !originResponseTime.equals(gelfDto.originResponseTime) : gelfDto.originResponseTime != null)
            return false;
        if (_user_id != null ? !_user_id.equals(gelfDto._user_id) : gelfDto._user_id != null) return false;
        if (_some_info != null ? !_some_info.equals(gelfDto._some_info) : gelfDto._some_info != null) return false;
        return _some_env_var != null ? _some_env_var.equals(gelfDto._some_env_var) : gelfDto._some_env_var == null;
    }

    @Override
    public int hashCode() {
        int result = version != null ? version.hashCode() : 0;
        result = 31 * result + (host != null ? host.hashCode() : 0);
        result = 31 * result + (short_message != null ? short_message.hashCode() : 0);
        result = 31 * result + (full_message != null ? full_message.hashCode() : 0);
        result = 31 * result + (timestamp != null ? timestamp.hashCode() : 0);
        result = 31 * result + (level != null ? level.hashCode() : 0);
        result = 31 * result + (clientDeviceType != null ? clientDeviceType.hashCode() : 0);
        result = 31 * result + (clientIP != null ? clientIP.hashCode() : 0);
        result = 31 * result + (clientIPClass != null ? clientIPClass.hashCode() : 0);
        result = 31 * result + (clientStatus != null ? clientStatus.hashCode() : 0);
        result = 31 * result + (clientRequestBytes != null ? clientRequestBytes.hashCode() : 0);
        result = 31 * result + (clientRequestReferer != null ? clientRequestReferer.hashCode() : 0);
        result = 31 * result + (clientRequestURI != null ? clientRequestURI.hashCode() : 0);
        result = 31 * result + (clientRequestUserAgent != null ? clientRequestUserAgent.hashCode() : 0);
        result = 31 * result + (clientSrcPort != null ? clientSrcPort.hashCode() : 0);
        result = 31 * result + (edgeServerIP != null ? edgeServerIP.hashCode() : 0);
        result = 31 * result + (edgeStartTimestamp != null ? edgeStartTimestamp.hashCode() : 0);
        result = 31 * result + (destinationIP != null ? destinationIP.hashCode() : 0);
        result = 31 * result + (originResponseBytes != null ? originResponseBytes.hashCode() : 0);
        result = 31 * result + (originResponseTime != null ? originResponseTime.hashCode() : 0);
        result = 31 * result + (_user_id != null ? _user_id.hashCode() : 0);
        result = 31 * result + (_some_info != null ? _some_info.hashCode() : 0);
        result = 31 * result + (_some_env_var != null ? _some_env_var.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "GelfDto{" +
                "version='" + version + '\'' +
                ", host='" + host + '\'' +
                ", short_message='" + short_message + '\'' +
                ", full_message='" + full_message + '\'' +
                ", timestamp=" + timestamp +
                ", level=" + level +
                ", clientDeviceType='" + clientDeviceType + '\'' +
                ", clientIP='" + clientIP + '\'' +
                ", clientIPClass='" + clientIPClass + '\'' +
                ", clientStatus=" + clientStatus +
                ", clientRequestBytes=" + clientRequestBytes +
                ", clientRequestReferer='" + clientRequestReferer + '\'' +
                ", clientRequestURI='" + clientRequestURI + '\'' +
                ", clientRequestUserAgent='" + clientRequestUserAgent + '\'' +
                ", clientSrcPort=" + clientSrcPort +
                ", edgeServerIP='" + edgeServerIP + '\'' +
                ", edgeStartTimestamp=" + edgeStartTimestamp +
                ", destinationIP='" + destinationIP + '\'' +
                ", originResponseBytes=" + originResponseBytes +
                ", originResponseTime=" + originResponseTime +
                ", _user_id=" + _user_id +
                ", _some_info='" + _some_info + '\'' +
                ", _some_env_var='" + _some_env_var + '\'' +
                '}';
    }
}
