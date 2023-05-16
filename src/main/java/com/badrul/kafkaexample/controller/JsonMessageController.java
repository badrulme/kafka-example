package com.badrul.kafkaexample.controller;

import com.badrul.kafkaexample.kafka.JsonKafkaProducer;
import com.badrul.kafkaexample.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("api/kafka")
public class JsonMessageController {

    private final JsonKafkaProducer kafkaProducer;

    @PostMapping("publish")
    public ResponseEntity<String> publish(@RequestBody User user) {
        log.info("User: " + user);
        kafkaProducer.sendMessage(user);

        return ResponseEntity.ok("JSON Message sent to Kafka topic");
    }
}
