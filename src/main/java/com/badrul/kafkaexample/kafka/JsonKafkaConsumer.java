package com.badrul.kafkaexample.kafka;

import com.badrul.kafkaexample.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class JsonKafkaConsumer {

    @KafkaListener(topics = "firstJsonTopic", groupId = "myGroup")
    public void consume(User user) {
        log.info("JSON message received -> " + user);
    }
}
