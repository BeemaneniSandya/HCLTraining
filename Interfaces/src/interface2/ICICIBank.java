package interface2;

class ICICIBank implements MutualFund {
	int amountinvest;
	private int sip;

	public ICICIBank(int amountinvest, int sip) {
		super();
		this.amountinvest = amountinvest;
		this.sip = sip;
	}

	@Override
	public void duration() {
		// TODO Auto-generated method stub
		System.out.println("ICICIBank-\n You Will have returns as" + (amountinvest * 60) / sip + "/-");
	}

	@Override
	public void amount() {
		// TODO Auto-generated method stub
		System.out.println("In " + sip + "years");
	}

}
