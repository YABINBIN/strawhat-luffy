package org.onepiece.luffy.service.rest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project: one-piece
 * package: org.onepiece.luffy.service.rest
 * company: www.strawhatluffy.com
 * auth: yangbb
 * data: 2019/01/06 上午1:11
 * email:yangbb@google.com
 */
@Slf4j
@RestController
@RequestMapping(value = "test")
public class RestTestService {

    @GetMapping("methodA")
    public String testMethod(){
        System.out.println("test success !");
        return "test success !";
    }
}