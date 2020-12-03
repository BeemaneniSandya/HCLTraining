package org.hclproblem2;

public class Displaydetails {
	Long over, ball, runs;
	String batsman, bowler, nonStriker;

	public Displaydetails(Long over, Long ball, Long runs, String batsman, String bowler, String nonStriker) {
		super();
		this.over = over;
		this.ball = ball;
		this.runs = runs;
		this.batsman = batsman;
		this.bowler = bowler;
		this.nonStriker = nonStriker;
	}

	void displayDeliveryDetails() {
		System.out.println("Delivery details:");
		System.out.println("Over:" +over+"\n"+"Ball:"+ball+"\n"+"Runs:"+runs+"\n"+"Batsman:"+batsman+"\n"+"Bowler:"+bowler+"\n"+"NonStriker"+nonStriker);
	}

}
