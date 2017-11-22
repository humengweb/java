package com.start.controller;

import com.start.service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestController {
    @Autowired
    RestService restService;
    @GetMapping("wocao")
    public String restTest(){
        return restService.hiService();
    }
}
