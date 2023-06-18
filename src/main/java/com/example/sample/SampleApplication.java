package com.example.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext context){
		return args -> {
			try{
				Scanner sc = new Scanner(System.in);
				System.out.print("[*]Enter your name : ");
				String name = sc.nextLine();
				System.out.println("[*]Welcome to the application : "+name);
			}catch(Exception e){
				e.printStackTrace();
			}
		};
	}

}
