package cn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author : zhen77
 * @date: 2021/2/6 - 02 - 06 - 23:02
 * @Description: cn
 * @version: 1.0
 */
@SpringBootApplication
@MapperScan("cn.zhen77.mapper")

public class SSMApplication {
    public static void main(String[] args) {
        SpringApplication.run(SSMApplication.class,args);
    }
}
