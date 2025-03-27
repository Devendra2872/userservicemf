package com.example.userservice;

import com.example.userservice.Security.repositories.JpaRegisteredClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserserviceApplicationTests {

	@Autowired
	private JpaRegisteredClientRepository registeredClientRepository;

	@Test
	void contextLoads() {
	}
}
