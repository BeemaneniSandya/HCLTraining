package interface2;

class HdfcBank implements MutualFund {
	int amountinvest;
	private int sip;

	public HdfcBank(int amountinvest, int sip) {
		super();
		this.amountinvest = amountinvest;
		this.sip = sip;
	}

	@Override
	public void duration() {
		// TODO Auto-generated method stub
		System.out.println("Hdfc Bank-\n You will have return as " + (amountinvest * 49) / sip + "/-");
	}

	@Override
	public void amount() {
		System.out.println("In" + sip + "years");
		// TODO Auto-generated method stub

	}

}
