package org.hclproblem;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String city;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the venue name:");
		name=sc.nextLine();
		System.out.println("Enter the city name:");
		city=sc.nextLine();
		venue v= new venue(name, city);
		System.out.println("venue details:");
		System.out.println("venue name:"+v.name);
		System.out.println("city name:"+v.city);
	}

}
