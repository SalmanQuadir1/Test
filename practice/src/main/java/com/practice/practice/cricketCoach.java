package com.practice.practice;

public class cricketCoach implements coach {
	
	private FortuneService fortuneService;

	private String emailAddress;
	private String team;

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("CricketCoach: Inside SetEmailAddress");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public cricketCoach() {
		System.err.println("CricketCoach: Inside No Arg Constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.err.println("CricketCoach: Inside Setter Method");

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice 5 hrs a day ";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
