package com.practice.practice;

public class BaseballCoach implements coach{
	 //Dependency Injection
	private FortuneService fortuneService;
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
		
	}
	
@Override
 public String getDailyWorkout() {
	 return "spend 30 min in practice daily";
	 
 }

@Override
public String getDailyFortune() {
	// use dependency
	return fortuneService.getFortune();
}
}
