package com.accdays.aop;

import org.springframework.stereotype.Service;

@Service
public class PersonServerImpl implements PersonServer {

	@Override
	public String save(String name) {
		System.out.println("我是save方法,保存："+name); 
		return "id=1";
	}

	@Override
	public void update(String name, Integer id) {
		System.out.println("我是update方法"); 
	}

	@Override
	public String getPersonName(Integer id) {
		System.out.println("我是getPersonName()方法"); 
		return "getPersonName";
	}

}
