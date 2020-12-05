package interface2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter amount to invest");
		int amountinvest = in.nextInt();
		int sip = in.nextInt();
	    MutualFund ab = new AxisBank(amountinvest, sip);
		ab.duration();
		ab.amount();
		ab = new HdfcBank(amountinvest, sip);
		ab.duration();
		ab.amount();
		ab = new ICICIBank(amountinvest, sip);
		ab.duration();
		ab.amount();
		in.close();

	}

}
