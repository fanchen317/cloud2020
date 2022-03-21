package com.fanchen.springcloud.service;

/**
 * @Author fanchen
 * @Date 2022/3/21 16:52
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
