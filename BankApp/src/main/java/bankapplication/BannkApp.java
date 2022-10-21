package bankapplication;

import java.util.Scanner;

import customerdetails.Account;
import services.OpenCurrentAccount;
import services.OpenSavingAccount;
import services.Procedures;

public class BannkApp extends Procedures{

	public static void main(String[] args) {
		System.out.println();
		System.out.println(" Welcome to our e-banking services.");
		System.out.println();
		System.out.println(" Press 1 to open new account.");
		System.out.println(" Press 2 to check your other information.");
		
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		
		switch(value) {
		case 1:
			procedureToCreateAccount();
			break;
		case 2:
			procedureToCheckInfo();
			break;
		default:
			System.out.println(" Please select correct input.");
		}
		}
}
