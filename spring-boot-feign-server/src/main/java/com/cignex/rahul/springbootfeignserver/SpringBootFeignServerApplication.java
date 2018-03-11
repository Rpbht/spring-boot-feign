package com.cignex.rahul.springbootfeignserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootFeignServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignServerApplication.class, args);
	}
}
