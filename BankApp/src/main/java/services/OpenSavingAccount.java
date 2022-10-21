package services;

import java.util.Scanner;

import customerdetails.Kyc;
import exceptions.InvalidInput;

public class OpenSavingAccount extends Kyc {


int amount;
	
	public void openSavingAc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("To open an Saving account, Verify for kyc ");
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
		
		System.out.println("Please deposite atlest 250 for your cheque book.");
		System.out.print("Please enter amout here : ");
		 amount = sc.nextInt();
		try {
			if (amount<=250) {
				throw new InvalidInput("Please deposite 250.");
			} else {
				System.out.println("Congratulations!\n Your account has been created.");
				
			}
		} catch (InvalidInput e) {
			System.out.println(e);
		}
		 savingAcOpened();
		
		}

	}
	
	public void savingAcOpened() {
		System.out.println();
		
		System.out.println("Account holder name: "+getName().toUpperCase());
		System.out.println("Account Number: "+getPanNumber());
		System.out.println("Account type: "+getType2());
		System.out.println("Total Balance: "+(amount-250));
	}

}
