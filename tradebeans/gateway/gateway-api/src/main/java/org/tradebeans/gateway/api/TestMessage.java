package org.tradebeans.gateway.api;

public record TestMessage(
        String traceId,
        String msg
) implements ApiMessage {




}