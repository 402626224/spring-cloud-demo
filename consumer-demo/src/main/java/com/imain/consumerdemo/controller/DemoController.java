package com.imain.consumerdemo.controller;

import com.imain.consumerdemo.feignclient.HelloWorldFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zipkin2.Span;

/**
 * author Songrui.Liu
 * date 2019/12/2315:39
 */
@RestController
public class DemoController {
    private static Logger log = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private HelloWorldFeignClient helloWorldFeignClient;

    @RequestMapping("/")
    public String home() {
        log.info("Handling home");
        String resp = helloWorldFeignClient.home();
        log.info("resp:{}", resp);
        return "Hello World";
    }
}