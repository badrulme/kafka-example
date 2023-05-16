package com.badrul.kafkaexample.kafka;

import com.badrul.kafkaexample.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class JsonKafkaProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    public void sendMessage(User user) {
        log.info(String.format("Message sent -> %s", user.toString()));
        kafkaTemplate.send("firstJsonTopic", user);
    }
}
