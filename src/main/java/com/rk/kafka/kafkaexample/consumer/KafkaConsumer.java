package com.rk.kafka.kafkaexample.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "test-topic", groupId = "group-1")
    public void consume(String message) {
        System.out.println("Consumed message: " + message);
    }

}
