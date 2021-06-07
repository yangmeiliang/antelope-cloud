package com.antelope;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @author yangmeiliang
 */
@SpringCloudApplication
public class AntelopeServiceWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AntelopeServiceWebApplication.class, args);
    }

}
