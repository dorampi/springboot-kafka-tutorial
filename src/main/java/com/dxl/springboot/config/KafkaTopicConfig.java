package com.dxl.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Value("${spring.kafka.topics.dxl}")
    private String dxlTopic;

    @Value("${spring.kafka.topics.dxl-json}")
    private String dxlJsonTopic;

    @Bean
    public NewTopic dxlTopic() {
        return TopicBuilder.name(dxlTopic)
                .build();
    }

    @Bean
    public NewTopic dxlJsonTopic() {
        return TopicBuilder.name(dxlJsonTopic)
                .build();
    }
}
