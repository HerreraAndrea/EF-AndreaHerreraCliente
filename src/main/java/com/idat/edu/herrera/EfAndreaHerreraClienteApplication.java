package com.idat.edu.herrera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EfAndreaHerreraClienteApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfAndreaHerreraClienteApplication.class, args);
	}

}
