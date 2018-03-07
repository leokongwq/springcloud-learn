package com.leokongwq.springcloud.bookservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@EnableApolloConfig(value = "application", order = 1)
@Import(ApolloConfigRegistrar.class)
public class AppConfig {


}