package com.xx;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author xiexing
 * @description order 启动器
 * @date 2021/3/1
 */
@Slf4j
@EnableEurekaClient
@SpringBootApplication
public class MicroserviceOrderBootstrap {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceOrderBootstrap.class,args);
        log.info("micro service order boot successfully..");
    }
}
