package cn.zhen77;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 15:21
 * @Description: cn.zhen77
 * @version: 1.0
 */
@SpringBootApplication
@EnableDubbo
@MapperScan("cn.zhen77.mapper")
public class ProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProviderApplication.class,args);

    }
}
