//package com.hompan.tueparking.parkingspace.config;
//
//import com.hompan.tueparking.parkingspace.entity.Seat;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
//import org.springframework.data.redis.serializer.RedisSerializer;
//import org.springframework.data.redis.serializer.StringRedisSerializer;
//
//import java.net.UnknownHostException;
//import java.util.List;
//
///**
// * @author Hom Pan
// * @date 2020/8/30 15:04
// */
//public class MyRedisConfig {
//
//    @Bean
//    public RedisTemplate<Object, Object> keyRedisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
//        RedisTemplate<Object, Object> template = new RedisTemplate();
//        template.setConnectionFactory(redisConnectionFactory);
//        //适用底层实现的序列化器
//        RedisSerializer redisSerializer = new StringRedisSerializer();
//        template.setKeySerializer(redisSerializer);
//        return template;
//    }
//
//    @Bean
//    public RedisTemplate<Object, Seat> seatRedisTemplate(RedisConnectionFactory redisConnectionFactory) throws UnknownHostException {
//        RedisTemplate<Object, Seat> template = new RedisTemplate();
//        template.setConnectionFactory(redisConnectionFactory);
//        //适用底层实现的序列化器
//        Jackson2JsonRedisSerializer<Seat> redisSerializer = new Jackson2JsonRedisSerializer<>(Seat.class);
//        template.setKeySerializer(redisSerializer);
//        return template;
//    }
//}
