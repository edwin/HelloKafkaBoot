package com.edw.hellokafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * <pre>
 *  com.edw.hellokafka.service.MessagingService
 * </pre>
 *
 * @author edwin < edwinkun at gmail dot com >
 * May 11, 2018 10:28:10 PM
 *
 */
@Service
public class MessagingService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    
    public void send(String message) {
        kafkaTemplate.send("test", message);
    }

}
