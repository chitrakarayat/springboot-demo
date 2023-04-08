package com.example.demo.student;

import java.time.LocalDate;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class StudentConfig {
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args->{
			Student chitra=new Student(
					"Chitra","chitra@gmail.com",LocalDate.of(2001,12,24));
			Student urja=new Student(
							"Urja","urja@gmail.com",LocalDate.of(2007,10,7));
			repository.saveAll(
					List.of(chitra,urja)
					);
		};
	}

}
