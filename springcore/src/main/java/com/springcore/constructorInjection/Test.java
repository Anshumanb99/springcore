package com.springcore.constructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springcore.collections.Emp;

public class Test {
	
	public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorInjection/constructorInjectionConfiguration.xml");
    Person person1=(Person) context.getBean("person1");
    System.out.println(person1);
    Person person2=(Person) context.getBean("person2");
    System.out.println(person2);

    Coder coder1=(Coder) context.getBean("coder1");
    System.out.println(coder1);
    
    Coder coder2=(Coder) context.getBean("coder2");
    System.out.println(coder2);
	}
}
