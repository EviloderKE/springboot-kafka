package com.example.springbootkafka.controller;

import com.example.springbootkafka.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @Autowired
    private KafkaService kafkaProducer;

    @GetMapping("simple")
    public void simple(){
        kafkaProducer.send();
    }

}
