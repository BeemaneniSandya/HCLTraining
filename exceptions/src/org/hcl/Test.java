package org.hcl;

public class Test {

	public static void main(String[] args) {
		Acct account = new Acct(5000);
		account.withDrawl(10000);
		System.out.println(account.balEnquiry());
	}

}