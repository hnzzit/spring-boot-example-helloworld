package io.zzit.example.controller;

import io.zzit.example.HelloApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = HelloApplication.class)
public class HolleWApplicationTests {

	@Autowired
	private HelloWorldController  helloWorldController;

	@Test
	public void contextLoads() {
		Assert.assertEquals("Holle，Spring Boot",helloWorldController.hello());
	}

}
