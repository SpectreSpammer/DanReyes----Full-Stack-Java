package com.onepieceofjava.DanReyesSpringbootWithoutComponent;

import com.onepieceofjava.DanReyesSpringbootWithoutComponent.service.OnePieceofJavaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(OnePieceofJavaService.class)
public class SpringbootOnePieceofJavaApplication {



	public static void main(String[] args) {
		SpringApplication.run(SpringbootOnePieceofJavaApplication.class, args);
	}

}
