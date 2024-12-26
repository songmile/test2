package com.cg;

import com.cg.service.AService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TransactionTest {
	
	@Test
	public void dataTest(){
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-mybatis.xml");
		AService service= context.getBean(AService.class);
		service.insertA("666");
	}
}
