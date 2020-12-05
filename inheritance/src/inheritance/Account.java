package inheritance;

public class Account {
	protected String accName, accNo, bankName;

	protected Account() {
	}

	public Account(String accName, String accNo, String bankName) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}

	protected void display() {
		// TODO Auto-generated method stub
		System.out.println("accName is :" + accName);
		System.out.println("accNo is :" + accNo);
		System.out.println("bankName :" + bankName);

	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

}