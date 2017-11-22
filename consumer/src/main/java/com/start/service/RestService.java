package com.start.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RestService {
    @Autowired
    RestTemplate restTemplate;
   public String hiService(){
       return restTemplate.getForObject("http://cloud-client/EurekaClient",String.class);
   }
}
