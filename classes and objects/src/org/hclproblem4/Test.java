package org.hclproblem4;

import java.util.Scanner;

import org.hclproblem2.Displaydetails;

public class Test {

	private static Object string;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String details;
		Test t = new Test();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name,country,skill:");
		details = sc.nextLine();
		String[] arrStrings = details.split(",");
		String a = arrStrings[0];
		String b = arrStrings[1];
		String c = arrStrings[2];

	}

}
