package com.practice.practice;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context = new  ClassPathXmlApplicationContext("applicationContext.xml");
	
	cricketCoach  thecoach = context.getBean("myCricketCoach", cricketCoach.class);
	
	System.out.println(thecoach.getDailyWorkout());
	System.out.println(thecoach.getDailyFortune());
	
	     /*     Call literal methods      */ 
	
	System.err.println(thecoach.getEmailAddress());
	System.out.println(thecoach.getTeam()); 




	context.close();
	}

}
