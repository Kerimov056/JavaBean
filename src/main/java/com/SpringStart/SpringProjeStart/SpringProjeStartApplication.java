package com.SpringStart.SpringProjeStart;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Proje.Model.User;
import com.Proje.Services.UserService;

import lombok.experimental.var;

@SpringBootApplication
public class SpringProjeStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringProjeStartApplication.class, args);
	
		
		UserService userListService = new UserService();
		List<User> userList = new ArrayList<>();
		userList.add(new User("Ulvi"));
		userList.add(new User("Senan"));
		userList.add(new User("Ferid"));
		
		userListService.setUserList(userList);
		
		UserService userListService2 = new UserService();
		
		for(var user : userListService.getUserList()) {
			System.out.println(user.getFirstName());
		}

	}

}
