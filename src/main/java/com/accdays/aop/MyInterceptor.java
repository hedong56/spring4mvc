package com.accdays.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyInterceptor {
	
	@Pointcut("execution(* com.accdays.aop.PersonServerImpl.*(..))")  
    private void anyMethod(){}//定义一个切入点  
      
    @Before("anyMethod() && args(name)")  
    public void doAccessCheck(String name){  
        System.out.println("@Before 前置通知");  
    }  
      
    @AfterReturning("anyMethod()")  
    public void doAfter(){  
        System.out.println("@AfterReturning");  
    }  
      
    @After("anyMethod()")  
    public void after(){  
        System.out.println("@After");  
    }  
      
    
    @AfterThrowing("anyMethod()")  
    public void doAfterThrow(){  
        System.out.println("例外通知");  
    }  
      
    @Around("anyMethod()")  
    public Object doBasicProfiling(ProceedingJoinPoint pjp) throws Throwable{  
        System.out.println("@Around 进入环绕通知");  
      //ProceedingJoinPoint的proceed()方法才会执行目标方法，才会执行@Before
        Object object = pjp.proceed();
        System.out.println("@Around 返回值 object="+object.toString());
        System.out.println("@Around 退出环绕通知");  
        return object;  
    }  

}
