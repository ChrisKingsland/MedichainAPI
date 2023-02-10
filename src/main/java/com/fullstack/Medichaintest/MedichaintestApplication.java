package com.fullstack.Medichaintest;

import com.fullstack.Medichaintest.document.Document;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication

public class MedichaintestApplication {
	public static void main(String[] args) {
		SpringApplication.run(MedichaintestApplication.class, args);



	}

}
