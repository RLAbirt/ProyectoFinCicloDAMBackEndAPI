package com.birt.berton.BertonRestAPI_PROY_1C;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class BertonRestApiProy1CApplication {

	public static void main(String[] args) {
		SpringApplication.run(BertonRestApiProy1CApplication.class, args);
	}

}
