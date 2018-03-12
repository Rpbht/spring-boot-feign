package com.cignex.rahul.springbootfeignclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@EnableFeignClients
@RequestMapping
public class SpringBootFeignClientApplication {

	@Autowired
	Client client;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFeignClientApplication.class, args);
	}

	@GetMapping
	public String fromClient() {
		return client.fromService();
	}

	@FeignClient("http://service")
	interface Client {
		@GetMapping(value="/fromService")
		String fromService();
	}
}
