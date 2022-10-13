package com.practice.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanLifecycleDemoapp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		coach theCoach = context.getBean("myCoach", coach.class);

		System.err.println(theCoach.getDailyWorkout());

		context.close();

	}

} 
