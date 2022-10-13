package com.practice.practice;

public class trackCoach implements coach {

	

	private FortuneService fortuneService;
	
	public trackCoach() {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	@Override
	public String getDailyFortune() {
		return  fortuneService.getFortune();
	}

	public void doMyStartUpStuff() {
		System.out.println("Just:Inside doMyStartUpMethod Method ");
	}
	public void doMyCleanUpStuff() {
		System.out.println("Just:Inside doMyCleanUpMethod Method ");

	}
}

