package com.example.springbootactivemq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

@Component
public class SendService {
    @Autowired
    Queue queue;
    private final JmsTemplate jmsTemplate;

    @Autowired
    public SendService(JmsTemplate jmsTemplate) {
        this.jmsTemplate = jmsTemplate;
    }

    public void sendMessage(String message) {
        jmsTemplate.convertAndSend(queue, message);
    }
}
