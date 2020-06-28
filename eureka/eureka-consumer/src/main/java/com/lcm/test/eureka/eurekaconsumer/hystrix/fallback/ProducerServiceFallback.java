package com.lcm.test.eureka.eurekaconsumer.hystrix.fallback;

import com.lcm.test.eureka.eurekaconsumer.pojo.Producer;
import com.lcm.test.eureka.eurekaconsumer.pojo.body.ProducerRequestBody;
import com.lcm.test.eureka.eurekaconsumer.service.ProducerService;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @description:
 * @author: lcm
 * @create: 2020-06-27 09:09
 **/
@Component
public class ProducerServiceFallback implements ProducerService {

    private static final Producer PRODUCER=new Producer();

    static {
        PRODUCER.setData("服务降级");
    }

    @Override
    public Producer get(@RequestBody ProducerRequestBody body) {
        return PRODUCER;
    }

}
