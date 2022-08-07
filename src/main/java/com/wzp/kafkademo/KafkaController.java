package com.wzp.kafkademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zp.wei
 * @date 2022/8/7 9:13
 */
@RestController
public class KafkaController {


    @Autowired
    private MessageProducer messageProducer;


    @GetMapping("/sendMessage")
    public String sendMessage(@RequestParam String message) {
        messageProducer.send(message);
        return "发送成功";
    }


}
