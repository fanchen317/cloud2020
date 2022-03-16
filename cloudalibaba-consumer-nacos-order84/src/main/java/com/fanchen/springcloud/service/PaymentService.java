package com.fanchen.springcloud.service;

import com.fanchen.springcloud.entities.CommonResult;
import com.fanchen.springcloud.entities.Payment;
import com.fanchen.springcloud.service.impl.PaymentFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author fanchen
 * @Date 2022/3/16 14:44
 */
@FeignClient(value = "nacos-payment-provider", fallback = PaymentFallbackService.class)
public interface PaymentService {
    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);
}
