package com.xxl.job.executor.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * author: yuzq
 * create: 2020-04-07 16:07
 **/
@FeignClient(name = "delivery-order")
public interface DeliveryOrderTaskService {

    @PostMapping("/cancelOutOfDateOrders")
     void cancelOutOfDateOrders();

    @PostMapping("/remainDriverPickupGoods")
     void remainDriverPickupGoods();
}
