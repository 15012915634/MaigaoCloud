package com.xj.apizuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApiZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiZuulApplication.class, args);
	}

}
