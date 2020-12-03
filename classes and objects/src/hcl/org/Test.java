package hcl.org;

import java.util.*;

public class Test {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		String venueName,city;
		int ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Venue Name:");
		venueName=sc.nextLine();
		System.out.println("Enter city Name:");
		city=sc.nextLine();
		Venue v=new Venue();
		v.setName(venueName);
		v.setCity(city);
		System.out.println("Venue Details:");
		System.out.println("Venue is:"+v.getName());
		System.out.println("City is:"+v.getCity());
		do {
		System.out.println("Verify and Update Venue Details \n"+"Menu");
		System.out.println("1.Update Venue Name \r\n"
				+"2.Update City Name \r\n"
				+"3.All information Correct/Exit \r\n"
				+"Type 1 or 2 or 3");
		ch=sc.nextInt();
		sc.nextLine();
		switch(ch)
		{
		case 1:
			System.out.println("Enter Venue name :");
			String name=sc.nextLine();
			v.setName(name);
			break;
		case 2:
			String cit;
			System.out.println("Enter City Details:");
			//sc.nextLine();
			cit=sc.nextLine();
			v.setCity(cit);
			break;
		 case 3:
			
			break;
		}
		System.out.println("Venue Details:");
		System.out.println("Venue is:"+v.getName());
		System.out.println("City is:"+v.getCity());
		
 
	}while(ch!=3);

}
}