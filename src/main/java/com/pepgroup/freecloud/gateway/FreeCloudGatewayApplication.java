package com.pepgroup.freecloud.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 网关服务启动类
 *
 * @author gang.liu
 */
@SpringBootApplication
public class FreeCloudGatewayApplication {

    /**
     * 网关服务启动方法
     *
     * @param args 服务参数
     */
    public static void main(String[] args) {
        SpringApplication.run(FreeCloudGatewayApplication.class, args);
    }
}
