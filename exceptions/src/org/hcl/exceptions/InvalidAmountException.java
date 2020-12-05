package org.hcl.exceptions;

public class InvalidAmountException extends RuntimeException {
	public InvalidAmountException(String desc) {
		super(desc);
	}
}