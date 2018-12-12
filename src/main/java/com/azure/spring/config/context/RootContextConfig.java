package com.azure.spring.config.context;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SpringSharedContextConfig.class, SpringWebContextConfig.class})
public class RootContextConfig {
}
