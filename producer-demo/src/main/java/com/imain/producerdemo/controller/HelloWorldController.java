package com.imain.producerdemo.controller;

import com.imain.apidemo.api.HelloWorldApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * author Songrui.Liu
 * date 2019/12/23 16:52
 */
@RestController
public class HelloWorldController implements HelloWorldApi {

    private static Logger log = LoggerFactory.getLogger(HelloWorldController.class);

    public String home() {
        log.info("Handling home");
        return "Hello World";
    }

}
