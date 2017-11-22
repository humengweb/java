package com.baidu.cloudclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * eureka:
 eureka.instance.prefer-ip-address指定注册服务的ip
 spring.application.name指定注册服务的名称
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudClientApplication {

	public static void main(String[] args) {
		//new SpringApplicationBuilder().web(true).sources(CloudClientApplication.class).run(args);
		SpringApplication.run(CloudClientApplication.class, args);
}
}
