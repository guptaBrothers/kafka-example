package com.rk.kafka.kafkaexample.controller;


import com.rk.kafka.kafkaexample.consumer.KafkaConsumer;
import com.rk.kafka.kafkaexample.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/kafka-service")
public class KafkaController {

    @Autowired
    private KafkaProducer producer;
    @Autowired
    private KafkaConsumer consumer;

    @GetMapping("/send/{message}")
    public String produceMessage(@PathVariable ("message") String message){

        producer.send(message);

        return "Message sent";
    }

    @GetMapping("/receive")
    public String consumeMessage(){

        //consumer.

        return "Message sent";
    }
}
