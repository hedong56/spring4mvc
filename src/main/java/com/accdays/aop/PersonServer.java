package com.accdays.aop;

public interface PersonServer {
	
	public String save(String name);  
    public void update(String name, Integer id);  
    public String getPersonName(Integer id);  

}
