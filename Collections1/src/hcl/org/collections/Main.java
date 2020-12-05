package hcl.org.collections;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of users :");
		sc.nextLine();
		Map<String, Integer> m = new TreeMap<>();
		System.out.println("Enter the details of user1 :");
		sc.nextLine();
		String string1 = new String("Jack" + "," + "Jack" + "," + "Jack");
		Integer integer1 = new Integer("12345");
		sc.nextLine();
		System.out.println("Enter the details of user2 :");
		String string2 = new String("Jane" + "," + "Jane" + "," + "Jane");
		Integer integer2 = new Integer("13579");
		sc.nextLine();
		System.out.println("Enter the details of user3 :");
		String string3 = new String("John" + "," + "John" + "," + "John");
		Integer integer3 = new Integer("24860");
		m.put(string1, integer1);
		m.put(string2, integer2);
		m.put(string3, integer3);
		Set<Map.Entry<String, Integer>> entries = m.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			String string = entry.getKey();
			Integer integer = entry.getValue();
		}
		String name = null;
		String MobileNumber = null;
		System.out.println("The User details in reverse order:" + "name" + "MobileNumber");
	}

}
