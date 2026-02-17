package com.onepieceofjava.DanReyesSpringbootWithoutComponent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
		"com.onepieceofjava.DanReyesSpringbootWithoutComponent.controller",
		"com.onepieceofjava.DanReyesSpringbootWithoutComponent.service",
		"com.onepieceofjava.DanReyesSpringbootWithoutComponent.model"
})

public class SpringbootOnePieceofJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootOnePieceofJavaApplication.class, args);
	}

}
