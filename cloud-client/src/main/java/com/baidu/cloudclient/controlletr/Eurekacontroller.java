package com.baidu.cloudclient.controlletr;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Eurekacontroller {
    @Autowired
    private EurekaClient discoveryClient;
    @GetMapping("/hello")
    public String hello(){
        return "hello world";

    }
    @GetMapping("EurekaClient")
    public String serviceUrl() {
        InstanceInfo instance = discoveryClient.getNextServerFromEureka("CLOUD-CLIENT", false);
        return instance.getHomePageUrl();
    }
}
