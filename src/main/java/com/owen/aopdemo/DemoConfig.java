package com.owen.aopdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author yuchlin on 3/30/19
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.owen.aopdemo")
public class DemoConfig {

}
