package Interface1;

public class Service implements Car {
	private double serviceCharge = 5000;
	private int carNum;
	private String brand;
	private int carYears;

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}

	public int getCarYears() {
		return carYears;
	}

	public void setCarYears(int carYears) {
		this.carYears = carYears;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Service(int carNum, String brand, int carYears) {
		super();
		this.carNum = carNum;
		this.brand = brand;
		this.carYears = carYears;
	}

	public void sum() {
		int r, s = 0;
		int num = this.carNum;
		while (num != 0) {
			r = num % 10;
			s += r;
			num /= 10;
		}
		if (s % 2 == 0) {
			System.out.println("You can come on Tuesday, Thursday or Saturday");
		} else {
			System.out.println("You can come on Monday, Wednesday or Friday");
		}
	}

	public void years() {
		if (this.carYears >= 5) {
			System.out.println("You are eligible for free washing.");
		} else {
			System.out.println("You are not eligible for free washing");
		}
	}

	public void brand() {
		if (this.brand.equalsIgnoreCase("MARUTI")) {
			this.serviceCharge -= (this.serviceCharge * 5f / 100);
			System.out.println("Your servicing charges are " + this.serviceCharge);
		}
	}
}
