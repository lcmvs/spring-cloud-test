package com.lcm.test.eureka.eurekaconsumer.pojo.body;

import lombok.Data;

import java.util.Date;

/**
 * @description:
 * @author: lcm
 * @create: 2020-06-26 14:28
 **/
@Data
public class ProducerRequestBody {

    private String name;

    private Date time;

}
