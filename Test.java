package org.hcl;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long over;
		Long ball;
		String wicketType, playerName, bowlerName;
		wicket w = new wicket();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of wickets :");
		String wicket = sc.next();
		System.out.println("Enter the details of wicket :");
		over = sc.nextLong();
		ball = sc.nextLong();
		wicketType = sc.nextLine();
		playerName = sc.nextLine();
		bowlerName = sc.nextLine();
		String[] arrString = wicket.split(",");
		String a = arrString[0];
		String b = arrString[1];
		String c = arrString[2];
		String d = arrString[3];
		String e = arrString[4];
		System.out.println("wicket Details :");
		System.out.println("over :" + w.getOver());
		System.out.println("balls :" + w.getBall());
		System.out.println("wicketType :" + w.getWicketType());
		System.out.println("playerName :" + w.getPlayerName());
		System.out.println("bowlerName :" + w.getBowlerName());
		sc.close();

	}

}
