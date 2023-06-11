package com.example.springbootkafka.consumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaConsumer {

    /**
     * 不同groupId可以消息同一条消息
     * @param record
     */
    @KafkaListener(topics = {"aa"}, groupId = "1")
    public void consumer(ConsumerRecord<?, ?> record) {
        log.info("消费消息topic:{}, offset:{}, value:{}", record.topic(), record.offset(), record.value());
    }

    @KafkaListener(topics = {"aa"}, groupId = "2")
    public void consumer2(ConsumerRecord<?, ?> record) {
        log.info("消费消息topic:{}, offset:{}, value:{}", record.topic(), record.offset(), record.value());
    }

}
