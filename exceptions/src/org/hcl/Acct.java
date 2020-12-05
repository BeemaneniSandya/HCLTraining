package org.hcl;

import org.hcl.exceptions.InvalidAmountException;

public class Acct {

	int bal;

	public Acct(int bal) {
		super();
		this.bal = bal;
	}

	public void deposit(int amt) {
		try {
			if (amt < 0) {
				InvalidAmountException ie = new InvalidAmountException("amount is invalid");
				throw ie;
			}
			this.bal = this.bal + amt;
		} catch (InvalidAmountException ie) {
			System.out.println(ie.getMessage());
		}
	}

	public void withDrawl(int amt) {
		try {
			if (amt > this.bal) {
				throw new InsufficientFundsException("Insuffiecient Funds");
			}
			this.bal = this.bal - amt;
		} catch (InsufficientFundsException ie) {
			System.out.println(ie.getMessage());
		}

	}

	public int balEnquiry() {
		return this.bal;
	}

	

}