package com.nibavs.kafka_example;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
            topics = "notifications",
            groupId = "groupId"
    )
    public void listen(MessageRequest request) {
        System.out.println("Listener received sender: " + request.sender() + "🥳");
        System.out.println("Listener received content: " + request.content());
    }
}
