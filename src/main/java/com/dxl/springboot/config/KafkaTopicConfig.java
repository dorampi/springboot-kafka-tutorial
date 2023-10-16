package com.dxl.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

//    TODO move the topic name to properties file and load via @Value annotation;
    @Bean
    public NewTopic dxlTopic() {
        return TopicBuilder.name("dxl")
                .build();
    }
}
