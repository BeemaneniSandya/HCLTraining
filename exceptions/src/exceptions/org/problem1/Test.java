package exceptions.org.problem1;

import java.util.*;

public class Test {

	public static void main(String[] args) {
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