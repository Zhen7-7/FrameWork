package cn.zhen77;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhen77
 * @date: 2021/3/20 - 03 - 20 - 18:21
 * @Description: cn.zhen77
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("cn.zhen77.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
