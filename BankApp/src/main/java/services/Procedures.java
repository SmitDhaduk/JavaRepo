package services;

import java.util.Scanner;

import customerdetails.Account;
import customerdetails.PersonalDetail;

public class Procedures {
	static Scanner sc = new Scanner(System.in);

	public static void procedureToCreateAccount() {

		System.out.println();
		System.out.println("Press 1 to create current account.");
		System.out.println("Press 2 to create saving account.");
		int value = sc.nextInt();

		if (value == 1) {
			OpenCurrentAccount oca = new OpenCurrentAccount();
			oca.openCurrentAc();
		} else if (value == 2) {
			OpenSavingAccount osa = new OpenSavingAccount();
			osa.openSavingAc();
		} else {

			System.out.println("Please select currect option.");
		}
	}

	public static void procedureToCheckInfo() {
		Account ac = new Account();

		System.out.println("Please enter your Personal details to check your information.");
		System.out.println();
		System.out.print("Enter your 10 digit A/c no: \n");
		int accountNum = sc.nextInt();
		System.out.println("Enter your 4 digit pin");
		int pin = sc.nextInt();
		PersonalDetail pd = new PersonalDetail();
		pd.personalDetail(accountNum, pin);
		if (pd.result) {
			
			System.out.println(
					" Enter 1 to withdraw \n Enter 2 to deposite. \n Enter 3 to check your balance and ac details");
			
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("Enter your amount");
				double total = sc.nextDouble();
				ac.withdraw(total);
			} else if (a == 2) {
				System.out.println("Enter your amount");
				double total = sc.nextDouble();
				ac.deposite(total);
			} else if (a == 3) {
				ac.accountDetail();
			} else {
				System.out.println("Select appropriate method.");
			}

		}else {
			System.out.println("Sorry! We can't able to match your information.");
			System.out.println();
			System.out.println("Please open a new Account.");
			System.out.println();
			procedureToCreateAccount();
		}
	}

}
