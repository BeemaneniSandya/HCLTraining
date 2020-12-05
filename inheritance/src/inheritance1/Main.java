package inheritance1;

public class Main {
	static String accName;
	static String accNo;
	static String bankName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the account details :");
		Account a = new Account();
		a.setAccName("Sita");
		a.setAccNo("ICICI0000543");
		a.setBankName("ICICI Bank");
		System.out.println(
				"AccName :" + a.getAccName() + "\n" + "AccNo :" + a.getAccNo() +"\n"+ "BankName :" + a.getBankName());
		a.display();

	}

}
