package com.fanchen.springcloud.service.impl;

import com.fanchen.springcloud.entities.CommonResult;
import com.fanchen.springcloud.entities.Payment;
import com.fanchen.springcloud.service.PaymentService;
import org.springframework.stereotype.Component;

/**
 * @Author fanchen
 * @Date 2022/3/16 14:44
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
