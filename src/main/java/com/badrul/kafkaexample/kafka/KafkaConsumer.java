package com.badrul.kafkaexample.kafka;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class KafkaConsumer {

    @KafkaListener(topics = "firstTopic", groupId = "myGroup")
    public void consume(String message) {
        log.info(String.format("Message received --> %s", message));
    }
}
