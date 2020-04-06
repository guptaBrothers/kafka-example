package com.rk.kafka.kafkaexample.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;


@Component
public class KafkaProducer {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate ;

    private String topic = "test-topic";

    public void send(String message) {

        kafkaTemplate.send(topic, message);
    }

}
