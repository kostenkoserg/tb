package org.tradebeans.gateway.jms;

import org.tradebeans.gateway.api.ApiMessage;

import java.util.Set;

public class JmsMessage<T extends ApiMessage> /**extends ApiMessage**/ {

    private Set<String> toUids;
    private String toDestination;
    private String replyDestination;

    private Long delayMessageMs = 0L;

    private long sentTime = System.currentTimeMillis();
    private String senderUid;

    private T apiMessage;

    public JmsMessage() {
    }

    public JmsMessage(String toDestination, T apiMessage) {
        this();
        this.toDestination = toDestination;
        this.apiMessage = apiMessage;
    }

//    @Override
//    public String traceId() {
//        return "";
//    }
}
