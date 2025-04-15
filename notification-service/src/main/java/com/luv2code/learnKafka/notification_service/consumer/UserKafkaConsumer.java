package com.luv2code.learnKafka.notification_service.consumer;

import com.luv2code.learnKafka.event.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserKafkaConsumer {

    @KafkaListener(topics = "user-created-topic")
    public void handleUserCreatedTopic(UserCreatedEvent userCreatedEvent){
        log.info("handleUserCreatedTopic Message received : {}",userCreatedEvent);
    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomTopic1(String message){
        log.info("handleUserRandomTopic1 Message received : {}",message);
    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomTopic2(String message){
        log.info("handleUserRandomTopic2 Message received : {}",message);
    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomTopic3(String message){
        log.info("handleUserRandomTopic3 Message received : {}",message);
    }
}
