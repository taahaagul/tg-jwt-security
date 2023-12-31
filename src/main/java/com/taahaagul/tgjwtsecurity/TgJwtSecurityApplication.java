package com.taahaagul.tgjwtsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class TgJwtSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(TgJwtSecurityApplication.class, args);
	}

}
