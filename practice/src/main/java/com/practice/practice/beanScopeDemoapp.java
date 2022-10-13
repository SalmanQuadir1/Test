package com.practice.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanScopeDemoapp {

	public static void main(String[] args) {     

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		coach theCoach = context.getBean("myCoach",coach.class);
	
		coach alphaCoach = context.getBean("myCoach",coach.class);

		//check if they r same 
		boolean result = (theCoach == alphaCoach);
		System.err.println(result);
		System.out.println("Memory location of theCoach:"+theCoach);
		System.err.println("Memory location of alphaCoach:"+alphaCoach);

		context.close();
		
	}

}
