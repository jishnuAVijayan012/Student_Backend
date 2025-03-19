package com.student.studentportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(basePackages = "com.student.studentportal.Entity")
public class StudentportalApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentportalApplication.class, args);
	}

}
