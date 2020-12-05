package exceptions.org.problem3;

import java.util.*;

class Test {
	public static void main(String s[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = { 10, 20, 30, 40, 50 };
		int no;
		System.out.println("enter the no");
		no = sc.nextInt();
		try {
			System.out.println(10 / no);
			System.out.println(a[6]);

		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("hi");
	}
}