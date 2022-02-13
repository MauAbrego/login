package com.practcias.microserviciologin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

// para iniciar: mvnw.cmd spring-boot:run desde terminal
@SpringBootApplication
@ComponentScan
public class MicroservicioLoginApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioLoginApplication.class, args);
	}

}
