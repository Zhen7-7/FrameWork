package cn.zhen77;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhen77
 * @date: 2021/3/15 - 03 - 15 - 9:25
 * @Description: cn.zhen77
 * @version: 1.0
 */

@SpringBootApplication
@EnableDubbo
public class ConsumerApplicaiton {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplicaiton.class,args);
    }
}
