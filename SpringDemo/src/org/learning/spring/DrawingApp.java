package org.learning.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");  
		//BeanFactory factory=context;
		
		Triangle triangle = (Triangle) context.getBean("alias-triangle");
		
		triangle.draw();
		
	}

}
