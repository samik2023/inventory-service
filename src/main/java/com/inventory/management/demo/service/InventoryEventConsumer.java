package com.inventory.management.demo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import static org.springframework.kafka.support.KafkaHeaders.TOPIC;

@Component
@Slf4j
public class InventoryEventConsumer {

    private static final String TOPIC = "orderTopic";

    @KafkaListener(topics = TOPIC,concurrency = "3",groupId = "inventory-group")
    private void listen(String msg) throws Exception{
        log.info("Received message :" + msg +  " in " + TOPIC );
        System.out.println("Received message :" + msg +  " in " + TOPIC );
        //throw new RuntimeException();

    }
}
