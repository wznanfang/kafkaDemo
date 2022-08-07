package com.wzp.kafkademo;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

/**
 * @author zp.wei
 * @date 2022/8/7 9:12
 */
@Configuration
public class KafkaConsumer {



    @KafkaListener(topics = "bootTopic")
    public void processMessage(String content) {
        System.out.println("content:" + content);
    }


    @KafkaListener(topics = "bootTopic1")
    public void processMessage1(String content) {
        System.out.println("content1:" + content);
    }

}
