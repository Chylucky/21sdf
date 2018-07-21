package com.bw.zhou.main;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bw.zhou.service.UserService;

public class MainTest {
     public static void main(String[] args) throws IOException {
		 String [] conf = {"classpath:spring/spring-mybatis.xml","classpath:spring/spring-dubbo.xml"};
		 ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(conf);
		  UserService demoService = (UserService) applicationContext.getBean("userService");
		    
		    // User user = new User();
		    // System.out.println("打印rpc信息:"+"----"+demoService.getList(a));
		    System.out.println("666666666666666");
		    applicationContext.start();
			System.in.read();
	}
}
