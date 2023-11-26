package com.springcore.constructorInjection.ambigutyError;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {
	
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorInjection/ambigutyError/AmbiguityConfiguration.xml");
    Addition addition1=(Addition) context.getBean("add1");
    System.out.println(addition1);
    addition1.doSum();
    
    System.out.println("changed the value of a and b using the index inside constructor-arg tag");
    
    Addition addition2=(Addition) context.getBean("add2");
    System.out.println(addition2);
    addition2.doSum();
    
	}
}
