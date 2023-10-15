package com.jiahao.Config;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.jiahao")
@PropertySource("classpath:jdbc.properties")
@Import({JDBCconfig.class, Mybatiesconfig.class})
public class Springconfig {
}
