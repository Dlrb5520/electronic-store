package com.yl.fallback;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class apiOrderFallback {

    @RequestMapping("fallback/{name}")
    public String orderFallback(@PathVariable("name") String name) {
        return "微服务:" + name + "访问超时,请稍后再试";
    }

}
