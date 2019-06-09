package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(5)
public class AppRunnerA implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("from runner-A");
	}

}
