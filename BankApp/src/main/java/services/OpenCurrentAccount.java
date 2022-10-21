package services;

import java.util.Scanner;

import customerdetails.Kyc;
import exceptions.InvalidInput;
import java.math.*;

public class OpenCurrentAccount extends Kyc {
	
	int minAmount;
	
	public void openCurrentAc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("To open Current account, Verify for kyc ");
		System.out.println();

		System.out.println("To verify your kyc press 1");
		int ans = sc.nextInt();
		if (ans == 1) {

			try {
				verifyKyc();
			} catch (InvalidInput e) {
				e.printStackTrace();
			}
		}
		if(getFlag()) {
		System.out.println();
		System.out.println("Please deposite 5000  or more to open an Account");
		System.out.print("Please enter amout here : ");
		 minAmount = sc.nextInt();
		try {
			if (minAmount < 5000) {
				throw new InvalidInput("You have entered Insuficient amount");
			} else {
				System.out.println("Congratulations!\n Your account has been created.");
			}
		} catch (InvalidInput e) {
			System.out.println(e);
		}
		currentAcOpened();
		
		}

	}
	
	public void currentAcOpened() {
		
		System.out.println();
		
		System.out.println("Account holder name: "+getName().toUpperCase());
		System.out.println("Account Number: "+getPanNumber());
		System.out.println("Account type: "+getType1());
		System.out.println("Total Balance: "+minAmount);
	}

}
