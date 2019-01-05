package org.onepiece.luffy.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * project: one-piece
 * package: org.onepiece.luffy.service
 * company: www.strawhatluffy.com
 * auth: yangbb
 * data: 2019/01/06 上午1:01
 * email:yangbb@google.com
 */
@SpringBootApplication
@EnableEurekaClient
public class LuffyServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(LuffyServiceApplication.class, args);
    }
}