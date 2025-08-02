package com.SpringStart.SpringProjeStart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.Proje"})
@SpringBootApplication
public class SpringProjeStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjeStartApplication.class, args);
	
		
		/*ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		UserService userService2 = context.getBean(UserService.class);
		
		for(var user : userService2.getUserList()) {
			System.out.println(user);
		}*/
		
		
	}

}
