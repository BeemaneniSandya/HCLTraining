package hcl.orgproblem;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		int quantity = sc.nextInt();
		double price = sc.nextDouble();
		double tax = sc.nextDouble();
		sc.nextLine();
		String name = sc.nextLine();
		String item = sc.nextLine();
		String message = name+ " wants to purchase a "+item+" at "+price;
		double total = quantity*tax*price;
		System.out.println(message);
		System.out.println(total);
	}

}
