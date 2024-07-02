package com.cogent.api;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	public static Logger Log = LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@Test
	void contextLoads() {
		
		Log.debug("Test Case executing ..... ");
	}

}
