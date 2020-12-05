package exceptions.org.problem2;

import java.util.*;

class Test {
	public static void main(String s[]) {
		String no;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("enter the no in string format");
			no = scanner.nextLine();
			Integer i = Integer.valueOf(no);
			System.out.println(i);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}