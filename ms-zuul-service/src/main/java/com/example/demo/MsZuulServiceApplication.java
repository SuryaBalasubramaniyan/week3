package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class MsZuulServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsZuulServiceApplication.class, args);
	}
	@Bean
	public SimpleFilter simpleFilter() {
		return new SimpleFilter();
	}
}
