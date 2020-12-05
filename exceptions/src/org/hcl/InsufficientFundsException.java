package org.hcl;

public class InsufficientFundsException extends RuntimeException {
	public InsufficientFundsException(String desc) {
		super(desc);
	}
}