package com.imain.consumerdemo.feignclient;

import com.imain.apidemo.api.HelloWorldApi;
import com.imain.apidemo.constant.GlobalConstant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * author Songrui.Liu
 * date 2019/12/23 18:39
 */
@FeignClient(GlobalConstant.SERVICE_NAME)
public interface HelloWorldFeignClient extends HelloWorldApi {

}
