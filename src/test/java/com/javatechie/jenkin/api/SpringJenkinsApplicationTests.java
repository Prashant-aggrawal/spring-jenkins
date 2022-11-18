package com.javatechie.jenkin.api;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ch.qos.logback.classic.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {

	public static Logger logger =(Logger) LoggerFactory.getLogger(SpringJenkinsApplication.class );
	
	@Test
	void contextLoads() {
		logger.info("test case exceuting" );
		
		assertEquals(true,true);
	}
	

}
