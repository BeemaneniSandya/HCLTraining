package inheritance1;

public class Account {
	protected String accName;
	protected String accNo;
	protected String bankName;

	public Account() {

	}

	public Account(String accName, String accNo, String bankName) {
		super();
		this.accName = accName;
		this.accNo = accNo;
		this.bankName = bankName;
	}

	/**
	 * @return the accName
	 */
	public String getAccName() {
		return accName;
	}

	/**
	 * @param accName the accName to set
	 */
	public void setAccName(String accName) {
		this.accName = accName;
	}

	/**
	 * @return the accNo
	 */
	public String getAccNo() {
		return accNo;
	}

	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	void display() {

	}

}
