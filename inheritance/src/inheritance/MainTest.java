package inheritance;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Choose Account type :");
		System.out.println("1. Saving Account\n2. Current Account");
		int ch = in.nextInt();
		in.nextLine();
		if (ch == 1) {
			SavingAccount savingAcc = new SavingAccount();
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,Organisation Name)");
			String details[] = in.nextLine().split(",");
			String name = details[0];
			String accno = details[1];
			String bankName = details[2];
			String orgName = details[3];
			savingAcc.setAccName(name);
			savingAcc.setAccNo(accno);
			savingAcc.setBankName(bankName);
			savingAcc.setOrgName(orgName);
			savingAcc.display();
		} else {
			System.out.println(
					"Enter Account details in comma separated(Account Name,Account Number,Bank Name,TIN Number)");
			String details[] = in.nextLine().split(",");
			CurrentAccount currAcc = new CurrentAccount(details[0], details[1], details[2], details[3]);
			currAcc.display();
		}
		in.close();
	}

}
