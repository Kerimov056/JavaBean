package com.Proje.Config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Proje.Model.User;
import com.Proje.Services.UserService;

@Configuration
public class AppConfig {

	@Bean
	public UserService userService() {
		UserService userListService = new UserService();
		List<User> userList = new ArrayList<>();
		userList.add(new User("Ulvi"));
		userList.add(new User("Senan"));
		userList.add(new User("Ferid"));
		
		userListService.setUserList(userList);
		
		return userListService;
	}
}
