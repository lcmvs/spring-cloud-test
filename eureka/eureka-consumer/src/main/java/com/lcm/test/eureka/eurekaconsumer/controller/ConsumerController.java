package com.lcm.test.eureka.eurekaconsumer.controller;

import com.lcm.test.eureka.eurekaconsumer.pojo.Producer;
import com.lcm.test.eureka.eurekaconsumer.pojo.body.ProducerRequestBody;
import com.lcm.test.eureka.eurekaconsumer.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * @description:
 * @author: lcm
 * @create: 2020-06-26 14:22
 **/
@RestController
public class ConsumerController {

    @Autowired
    ProducerService producerService;

    @PostMapping("get")
    Producer get(){
        ProducerRequestBody body=new ProducerRequestBody();
        body.setName("lcm");
        body.setTime(new Date());
        Producer producer = producerService.get(body);
        return producer;
    }

}
