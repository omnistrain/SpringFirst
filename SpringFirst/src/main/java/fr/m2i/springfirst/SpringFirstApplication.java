package fr.m2i.springfirst;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.m2i.springfirst.service.Exemple;

@SpringBootApplication
public class SpringFirstApplication implements CommandLineRunner {


	

	public static void main(String[] args) {
		SpringApplication.run(SpringFirstApplication.class, args);
		
	
	
	}

	@Override
	public void run(String... args) throws Exception {

		try(AnnotationConfigApplicationContext appCtx = new AnnotationConfigApplicationContext(Exemple.class)){
			
			
			while(true) {
				
				Thread.sleep(1000);
				LocalTime time = appCtx.getBean("now",LocalTime.class);
			
				System.out.println(time);
			}
		}
		
		
		
	}




}
