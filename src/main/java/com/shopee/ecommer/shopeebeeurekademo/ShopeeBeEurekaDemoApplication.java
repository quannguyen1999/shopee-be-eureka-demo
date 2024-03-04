package com.shopee.ecommer.shopeebeeurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ShopeeBeEurekaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopeeBeEurekaDemoApplication.class, args);
	}

}
