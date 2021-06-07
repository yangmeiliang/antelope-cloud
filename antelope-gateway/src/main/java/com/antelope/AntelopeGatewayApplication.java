package com.antelope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author yangmeiliang
 */
@SpringCloudApplication
public class AntelopeGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntelopeGatewayApplication.class, args);
    }

}
