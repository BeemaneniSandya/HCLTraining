package interface2;

interface MutualFund {
	public void duration();

	public void amount();
}

class AxisBank implements MutualFund {
	int amountinvest;
	private int sip;

	public AxisBank(int amountinvest, int sip) {
		super();
		this.amountinvest = amountinvest;
		this.sip = sip;
	}

	@Override
	public void duration() {
		// TODO Auto-generated method stub
		System.out.println("Axis Bank-\n you will have returns as" + (amountinvest * 56) / sip + "/-");
	}

	@Override
	public void amount() {
		// TODO Auto-generated method stub
		System.out.println("In" + sip + "years\n");
	}

}
