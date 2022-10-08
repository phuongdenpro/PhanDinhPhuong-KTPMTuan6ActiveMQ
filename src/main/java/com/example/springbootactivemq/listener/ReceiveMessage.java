package com.example.springbootactivemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ReceiveMessage {

    @JmsListener(destination = "phuong.queue")
    public void receiveMessage(String message) {
        System.out.println("Received Message: " + message);
    }
}