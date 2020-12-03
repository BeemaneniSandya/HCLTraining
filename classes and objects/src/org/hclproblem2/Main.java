package org.hclproblem2;
import java.util.*;

import org.hclproblem1.Delivery;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t = new Scanner(System.in);
		System.out.println("Enter the over:");
		Long over = t.nextLong();
		System.out.println("Enter the ball:");
		Long ball = t.nextLong();
		System.out.println("Enter the runs:");
		Long runs = t.nextLong();
		t.nextLine();
		System.out.println("Enter the batsman name:");
		String batsman = t.nextLine();
		System.out.println("Enter the bowler name:");
		String bowler = t.nextLine();
		System.out.println("Enter the nonStriker name:");
		String nonStriker = t.nextLine();
		Delivery s = new Delivery(over, ball, runs, batsman, bowler, nonStriker);
		s.displaydeliverydetails();
	}

}
