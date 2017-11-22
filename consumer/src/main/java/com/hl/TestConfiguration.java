package com.hl;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@Configuration
@RibbonClient(name = "CONSUMER", configuration = TestConfiguration.class)
public class TestConfiguration {


}