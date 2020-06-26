package com.lcm.test.eureka.eurekaproducer.controller;

import com.lcm.test.eureka.eurekaproducer.controller.body.ProducerRequestBody;
import com.lcm.test.eureka.eurekaproducer.pojo.Producer;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @description:
 * @author: lcm
 * @create: 2020-06-26 14:22
 **/
@RestController
public class ProducerController {

    @PostMapping("get")
    Producer producer(@RequestBody ProducerRequestBody body){
        Producer producer=new Producer();
        producer.setData("test");
        producer.setName(body.getName());
        producer.setTime(new Date());
        return producer;
    }

}
