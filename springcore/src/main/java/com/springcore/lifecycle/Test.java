package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		//AbstractApplicationContext is used to get the shutdown hook method that we can use to destroy the bean
	
		 System.out.println("using init and destroy method inside interface");
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/LifecycleConfiguration.xml");
	
	Product product1=(Product) context.getBean("product1");
    System.out.println(product1);
    InterfaceObject object1=(InterfaceObject) context.getBean("interfaceObject1");
    System.out.println(object1);
    
    AnnotationUseDemo annotatedObject=(AnnotationUseDemo) context.getBean("annotationObject1");
    System.out.println(annotatedObject);
    //registering shutdown hook 
    context.registerShutdownHook();

    
    
	}
}
