package com.Proje.Config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Proje.Model.Emplyee;

@Configuration
public class AppConfig {

	
	@Bean
	public List<Emplyee> employeeList (){
		List<Emplyee> emplyeList = new ArrayList<>();
		emplyeList.add(new Emplyee("1","Ulvi","Kerimov"));
		emplyeList.add(new Emplyee("2","Resad","Ibrahimov"));
		emplyeList.add(new Emplyee("3","Selimov","Elizar"));
		
		return emplyeList;
	}
}
