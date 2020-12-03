package org.hclproblem3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String details = null;
		Extratype e=new Extratype(details, null);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter ExtraType Details:");
		details=sc.nextLine();
		System.out.println("ExtraType Details:");
		String[] arrStrings = details.split("#");
		e.setName(arrStrings[0]);
		System.out.println("ExtraType:"+e.getName());
		long r=Long.parseLong(arrStrings[1]);
		e.setRuns(r);
		System.out.println("Runs:"+e.getRuns());
	}

}
