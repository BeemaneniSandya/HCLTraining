package inheritance;

public class CurrentAccount extends Account {
	private String tinNumber;
	
	public CurrentAccount(String accName, String accNo, String bankName, String tinNumber) {
		super(accName, accNo, bankName);
		this.setTinNumber(tinNumber);
	}

	public String getTinNumber() {
		return tinNumber;
	}

	public void setTinNumber(String tinNumber) {
		this.tinNumber = tinNumber;
	}
	
	public void display() {
		super.display();
		System.out.println("tinNumber :"+this.tinNumber);
	}

}
