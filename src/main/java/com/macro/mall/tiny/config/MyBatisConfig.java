package com.macro.mall.tiny.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by IntelliJ IDEA.
 *
 * @author aabo
 * @createTime 2022/9/10 10:26
 */
@Configuration
@MapperScan({"com.macro.mall.tiny.mbg.mapper", "com.macro.mall.tiny.dao"})
public class MyBatisConfig {

}
