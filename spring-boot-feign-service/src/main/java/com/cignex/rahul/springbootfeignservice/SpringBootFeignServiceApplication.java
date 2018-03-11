package com.cignex.rahul.springbootfeignservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class SpringBootFeignServiceApplication {

	@GetMapping
	public String fromService() {
		return "fromService";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignServiceApplication.class, args);
	}
}
