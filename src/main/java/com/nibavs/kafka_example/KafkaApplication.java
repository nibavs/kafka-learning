package com.nibavs.kafka_example;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class KafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}


	@Bean
	public NewTopic notificationsTopic() {
		return TopicBuilder.name("notifications").partitions(1).replicas(1).build();
	}

}
