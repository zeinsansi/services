package com.homelancer.services.controller;

import com.homelancer.services.producer.RabbitMQProducer;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("services/")
public class ServicesController {

    private RabbitMQProducer producer;

    public ServicesController(RabbitMQProducer producer) {
        this.producer = producer;
    }

    @GetMapping("hallo")
    public String getService(){
       String companyName = "Rbee";
       String description = "ik kom bij je thuis knippen";
       producer.sendMessage(companyName);
       return "Hallo, this is the Services server";
    }
}
