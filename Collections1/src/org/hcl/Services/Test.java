package org.hcl.Services;

import java.util.List;
import java.util.Scanner;

import org.hcl.Emp;

public class Test {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeServiceimpl();
		int ch;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.insert");
			System.out.println("2.delete");
			System.out.println("3.getting Object");
			System.out.println("4.getting all objects");
			System.out.println("5.exit");
			System.out.println("enter the choice");
			ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				Emp e = getEmployeeObject(sc);
				boolean b = service.addEmployee(e);
				if (b)
					System.out.println("successfully inserted");
				else
					System.out.println("not inserted successfully");
				break;
			case 2:
				Emp e1 = getEmployeeObject(sc);
				boolean b1 = service.deleteEmployee(e1);
				if (b1)
					System.out.println("successfully deleted");
				else
					System.out.println("not deleted");
				break;
			case 3:
				int no;
				System.out.println("enter the eno");
				no = sc.nextInt();
				Emp e3 = service.getEmployee(no);
				System.out.println(e3);
				break;
			case 4:
				List<Emp> employees = service.getEmployees();
				System.out.println("the employees are");
				for (Emp employee : employees) {
					System.out.println(employee);
				}
				break;

			}

		} while (ch <= 4);

	}

	private static Emp getEmployeeObject(Scanner sc) {
		int eno;
		String name, address;
		System.out.println("enter the employee details");
		eno = sc.nextInt();
		sc.nextLine();
		name = sc.nextLine();
		address = sc.nextLine();
		return new Emp(eno, name, address);
	}

}