package com.hompan.tueparking.parkingspace.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Hom Pan
 * @date 2020/8/30 21:38
 */
@Configuration
public class MyAmqpConfig {

    @Bean
    //json序列化
    public MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }
}
