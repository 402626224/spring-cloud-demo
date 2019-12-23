package com.imain.apidemo.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * author Songrui.Liu
 * date 2019/12/23 18:47
 */
public interface HelloWorldApi {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home();

}
