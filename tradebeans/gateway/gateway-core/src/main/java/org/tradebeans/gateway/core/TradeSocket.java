package org.tradebeans.gateway.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.websocket.*;
import jakarta.websocket.server.ServerEndpoint;
import org.tradebeans.gateway.api.ApiMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.inject.Inject;
import org.tradebeans.gateway.api.TestMessage;
import org.tradebeans.gateway.jms.JmsMessage;
import org.tradebeans.gateway.jms.JmsMessageSender;

@ServerEndpoint("/ws/trade")
@ApplicationScoped
public class TradeSocket {

    @Inject
    ObjectMapper objectMapper;

    @OnOpen
    public void onOpen(Session session) {
        System.out.println("New WebSocket connection: " + session.getId());
    }

    @OnClose
    public void onClose(Session session) {
        System.out.println("WebSocket connection closed: " + session.getId());
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        System.out.println("Error in WebSocket connection: " + session.getId());
    }

    @OnMessage
    public void onMessage(String message, Session session) throws Exception {
        try {
            System.out.println("Received message: " + message);
            ApiMessage msg = objectMapper.readValue(message, ApiMessage.class);



            //session.getOpenSessions().forEach();

            //JmsMessageSender.send(new JmsMessage("INBOUND", msg));

            //(TestMessage)msg

            /*TestMessage msg2 = new TestMessage("123",
                    "Hello World!",
                    .....
            ....................
            .....
            .....
            .....
                    "N"
                    );


            msg2.se*/



            System.out.println(msg.getClass().getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


//    CORE:
//            ->    JmsMessageSender.send(new JmsMessage("OUTBOUND", msg2));



}
