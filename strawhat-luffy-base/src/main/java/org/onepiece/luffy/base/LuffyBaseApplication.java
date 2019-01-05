package org.onepiece.luffy.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * project: one-piece
 * package: org.onepiece.luffy.base
 * company: www.strawhatluffy.com
 * auth: yangbb
 * data: 2019/01/06 上午12:43
 * email:yangbb@google.com
 */
@SpringBootApplication
@EnableEurekaServer
public class LuffyBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LuffyBaseApplication.class,args);
    }

}