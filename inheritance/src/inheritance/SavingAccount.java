package inheritance;

public class SavingAccount extends Account {
	private String orgName;

	public SavingAccount() {

	}

	public SavingAccount(String accName, String accNo, String bankName, String org) {
		super(accName, accNo, bankName);
		this.orgName = org;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public void display() {
		super.display();
		System.out.println("Org Name : " + this.orgName);
	}
}
