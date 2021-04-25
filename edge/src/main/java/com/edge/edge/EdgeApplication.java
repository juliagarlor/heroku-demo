package com.edge.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.*;
import org.springframework.cloud.openfeign.*;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EdgeApplication.class, args);
	}

}
