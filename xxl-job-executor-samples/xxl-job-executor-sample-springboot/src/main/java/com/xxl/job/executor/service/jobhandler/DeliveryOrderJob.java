package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import com.xxl.job.core.log.XxlJobLogger;
import com.xxl.job.executor.feign.DeliveryOrderTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * author: yuzq
 * create: 2020-04-07 17:36
 **/
@Component
public class DeliveryOrderJob {

    @Autowired
    private DeliveryOrderTaskService deliveryOrderTaskService;

    @XxlJob("cancelOutOfDateOrders")
    public ReturnT<String> cancelOutOfDateOrders(String param){
        XxlJobLogger.log("调用了order");
        deliveryOrderTaskService.cancelOutOfDateOrders();
        return ReturnT.SUCCESS;
    }

    @XxlJob("remainDriverPickupGoods")
    public ReturnT<String> remainDriverPickupGoods(String param){
        XxlJobLogger.log("调用了order");
        deliveryOrderTaskService.remainDriverPickupGoods();
        return ReturnT.SUCCESS;
    }
}
