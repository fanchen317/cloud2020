package com.fanchen.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author fanchen
 * @Date 2022/3/21 16:21
 */
@Configuration
@MapperScan({"com.fanchen.springcloud.dao"})
public class MyBatisConfig {
}
