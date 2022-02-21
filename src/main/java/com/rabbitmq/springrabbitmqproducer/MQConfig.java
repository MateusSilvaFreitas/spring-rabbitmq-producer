package com.rabbitmq.springrabbitmqproducer;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MQConfig {

    @Bean
    public Queue queue(){
        return new Queue("message_queue" );
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("message_exchange");
    }

    public Binding
}
