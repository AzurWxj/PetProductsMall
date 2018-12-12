package com.azure.spring.config.context;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({"classpath:spring/springmvc-config.xml"})
public class SpringWebContextConfig {
}
