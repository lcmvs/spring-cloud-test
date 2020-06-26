package com.lcm.test.eureka.eurekaconsumer.service;

import com.lcm.test.eureka.eurekaconsumer.pojo.Producer;
import com.lcm.test.eureka.eurekaconsumer.pojo.body.ProducerRequestBody;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description:
 * @author: lcm
 * @create: 2020-06-26 14:32
 **/
@FeignClient(name = "eureka-producer")
public interface ProducerService {

    @PostMapping("/eureka/producer/get")
    Producer get(@RequestBody ProducerRequestBody body);

}
