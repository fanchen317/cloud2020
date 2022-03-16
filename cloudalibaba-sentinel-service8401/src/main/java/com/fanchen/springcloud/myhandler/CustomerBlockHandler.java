package com.fanchen.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.fanchen.springcloud.entities.CommonResult;

/**
 * @Author fanchen
 * @Date 2022/3/10 18:01
 */
public class CustomerBlockHandler {
    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444,"按客戶自定义,global handlerException----2");
    }
}
