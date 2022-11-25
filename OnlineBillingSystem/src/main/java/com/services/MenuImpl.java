package com.services;

import java.text.ParseException;

import com.dto.UserPersonalDetails;

public class MenuImpl implements Menu {

	
	static AccountsImpl ac = new AccountsImpl();
	public static  void selectOptions() throws ParseException {


		System.out.println("Welcome to OnlineBillingSystem App!!\n");

		ac.addAccount();
		System.out.println("Your account has been created suucessfully!!");

		int input;

		do {
			
			System.out.println("\n\nPress 1 to log in or Press 2 to sing in");

			int value = ac.sc.nextInt();

			if (value == 1) {

				SelectAccountImpl usr = new SelectAccountImpl();
				HasAccountImpl hasAc = new HasAccountImpl();
				boolean flag;

				
				System.out.println("Enter your mail id to log in App");
				String userid = ac.sc.next();
				flag=hasAc.checkUserHasAccount(userid);
				if(!flag) {
					System.out.println("Your id is not register with us!!\nPlese register this id.\n");
					ac.addAccount();

				}
				
				System.out.println("press 1 to check your wallet information");
				System.out.println("press 2 to recharge");

				int slc = ac.sc.nextInt();
				if (slc == 1) {

					int index = usr.user(userid);
					System.out.println("\nAccountHolderName: " + ac.userList.get(index).getName());

					for (UserPersonalDetails upd : ac.userList) {
						if (ac.userList.indexOf(upd) == index) {
							System.out.println("\nAccountHolderBankDetails: " + ac.userList.get(index).getList());
						}
					}

					System.out.println();

					System.out.println();
					System.out.println("Do you want to add another bank account\nPress 1");
					System.out.println();
					input = ac.sc.nextInt();
					if (input == 1) {
						AddBankImpl addBank = new AddBankImpl();
						addBank.addbank(userid);
					}

					System.out.println();
				} else if (slc == 2) {

					do {
						RechargeImpl rc = new RechargeImpl();

						System.out.println("Enter your phone number: ");
						String number = ac.sc.next();

						System.out.println("Enter your company name: ");
						String carrier = ac.sc.next();

						
							flag = rc.verifyNumber(number, carrier);

					} while (!flag);

				}

			} else if (value == 2) {
				ac.addAccount();

			} else {
				System.out.println("Please enter correct input!!!");
			}
			System.out.println("----------------------------------*-*-*----------------------------------");
			System.out.println("To continue use press 1");
			input = ac.sc.nextInt();

		} while (input == 1);
	}

}
