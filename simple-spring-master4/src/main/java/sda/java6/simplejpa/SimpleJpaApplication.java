package sda.java6.simplejpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SimpleJpaApplication {
	public static void main(String[] args) {
		SpringApplication.run(SimpleJpaApplication.class, args);
	}

	@Bean
	public Car getCar(){
		return new Car(100);
	}
}
