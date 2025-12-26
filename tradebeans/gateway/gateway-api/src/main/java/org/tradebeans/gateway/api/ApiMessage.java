package org.tradebeans.gateway.api;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "cls")
public interface ApiMessage {
    String traceId();
//    String traceId();
//    String traceId();
//    String traceId();
}
