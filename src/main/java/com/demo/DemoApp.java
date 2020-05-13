package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author 86185
 * @date 2020年4月21日
 * @version
 * @description
 */

@SpringBootApplication
@MapperScan("com.demo.dao")
public class DemoApp {
	public static void main(String[] args) {
		SpringApplication.run(DemoApp.class, args);
	}
}
