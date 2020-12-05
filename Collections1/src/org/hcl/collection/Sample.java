package org.hcl.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		List<Emp> employees = readData();
		printData(employees);
	}

	private static void printData(List<Emp> employees) {
		System.out.println("the Employees are");
		for (Emp e : employees) {
			System.out.println(e);
		}
	}

	private static List<Emp> readData() {
		int n, eno;
		String name, address;
		List<Emp> employees = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of objects you want");
		n = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			System.out.println("Enter the employee " + (i + 1) + " details");
			eno = sc.nextInt();
			sc.nextLine();
			name = sc.nextLine();
			address = sc.nextLine();
			Emp e = new Emp();
			e.setEno(eno);
			e.setName(name);
			e.setAddress(address);
			employees.add(e);
		}
		return employees;
	}

}
