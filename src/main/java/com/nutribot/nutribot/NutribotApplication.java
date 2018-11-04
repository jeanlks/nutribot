package com.nutribot.nutribot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class NutribotApplication {

	public static void main(String[] args) {
		ApiContextInitializer.init();
		SpringApplication.run(NutribotApplication.class, args);
	}
}
