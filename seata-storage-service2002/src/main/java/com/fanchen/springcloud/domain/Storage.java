package com.fanchen.springcloud.domain;

import lombok.Data;

/**
 * @Author fanchen
 * @Date 2022/3/21 16:49
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}