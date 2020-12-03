package org.hclproblem1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Delivery d = new Delivery(null, null, null, null, null, null);
		Scanner sc = new Scanner(System.in);
		String batsman, bowler, nonStriker;
		Long over, ball, runs;
		System.out.println("Enter over:");
		over = sc.nextLong();
		System.out.println("Enter ball:");
		ball = sc.nextLong();
		System.out.println("Enter runs:");
		runs = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter batsman:");
		batsman = sc.nextLine();
		System.out.println("Enter bowler:");
		bowler = sc.nextLine();
		System.out.println("Enter nonStriker:");
		nonStriker = sc.nextLine();
		d.setOver(over);
		d.setBall(ball);
		d.setRuns(runs);
		d.setBatsman(batsman);
		d.setBowler(bowler);
		d.setNonStriker(nonStriker);
		System.out.println("Over:" + d.getOver());
		System.out.println("Ball:" + d.getBall());
		System.out.println("Runs:" + d.getRuns());
		System.out.println("Batsman:" + d.getBatsman());
		System.out.println("Bowler:" + d.getBowler());
		System.out.println("NonStriker:" + d.getNonStriker());
	}

}
