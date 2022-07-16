package com.sadu.family;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class FamilyApplication {

	public static void main(String[] args) {
		log.info("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&7777");
		log.info("FamilyApplication is started");
		SpringApplication.run(FamilyApplication.class, args);
	}

}
