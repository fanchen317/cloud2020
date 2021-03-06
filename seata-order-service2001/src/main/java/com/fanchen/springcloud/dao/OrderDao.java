package com.fanchen.springcloud.dao;

import com.fanchen.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author fanchen
 * @Date 2022/3/21 16:10
 */
@Mapper
public interface OrderDao {
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId, @Param("status") Integer status);

}
