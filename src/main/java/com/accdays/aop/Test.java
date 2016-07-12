package com.accdays.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml","/servlet/spring-servlet.xml");
		PersonServer personServerImpl=(PersonServer)factory.getBean("personServerImpl");
		String rs=personServerImpl.save("zhangsan");
		System.out.println(rs);
		
//		输出结果
//		@Around 进入环绕通知
//		@Before 前置通知
//		我是save方法,保存：zhangsan
//		@Around 返回值 object=id=1
//		@Around 退出环绕通知
//		@After
//		@AfterReturning
//		id=1
	}

}
