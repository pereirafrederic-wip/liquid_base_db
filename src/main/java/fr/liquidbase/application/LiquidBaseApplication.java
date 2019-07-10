package fr.liquidbase.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class LiquidBaseApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(LiquidBaseApplication.class, args);
	}

}
