package com.example.springbootactivemq.controller;

import com.example.springbootactivemq.service.SendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

@RestController
public class SendController {

    @Autowired
    private SendService  SendService;
    @Autowired
    JmsTemplate jmsTemplate;

    @Autowired
    Queue queue;

    @GetMapping("/send/{message}")
    public String sendMessage(@PathVariable("message")
                          final String message) {
        SendService.sendMessage(message);
        return "Sent " + message;
    }
}