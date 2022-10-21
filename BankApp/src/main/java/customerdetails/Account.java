package customerdetails;

public class Account{

	String name = "Smit Dhaduk";
	public static int acNum = 1234567890;
	String acType = "Saving Account";
	public static int pin=1234;
	double totalBalance = 10000;
	double amount;

	public void accountDetail() {
		System.out.println("Account holder name: " + name.toUpperCase());
		System.out.println("Account Number: " + acNum);
		System.out.println("Account type: " + acType);
		System.out.println("Total Balance: " + totalBalance);
	}
	
	public void withdraw(double tb) {
		 System.out.println("Balance: "+totalBalance);
		double updatedAmount = totalBalance-tb;
	 System.out.println("Update balance is : "+updatedAmount);
	}
	 public void deposite(double tb) {
		 System.out.println("Balance: "+totalBalance);
		 double updatedAmount = tb+totalBalance;
		 System.out.println("Updated balance is : "+updatedAmount);
	 }
}

