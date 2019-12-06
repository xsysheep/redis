package com.demo.redis.redis.config;

import com.demo.redis.redis.bean.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogConfig {
    private static final Logger LOG = LoggerFactory.getLogger(LogConfig.class);

    @Bean
    public Person logMethod() {
        LOG.info("==========print log==========");
        return new Person();
    }
}
