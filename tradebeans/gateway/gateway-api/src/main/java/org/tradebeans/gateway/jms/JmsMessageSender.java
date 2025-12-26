package org.tradebeans.gateway.jms;

public interface JmsMessageSender {
    void send(JmsMessage<?> message);
}