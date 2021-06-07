package com.antelope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yaml
 * @since 2020/5/25
 */
@EnableEurekaServer
@SpringCloudApplication
public class AntelopeEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntelopeEurekaApplication.class, args);
    }
}
