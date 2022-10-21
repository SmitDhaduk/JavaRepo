package customerdetails;

import java.util.Scanner;

import exceptions.InvalidInput;
import services.AccountTypes;

public class Kyc extends AccountTypes{

	static boolean flag = false;
	static String name;
	static int panNumber;
	
	public int getPanNumber() {
		return this.panNumber;
	}

	public String getName() {
		return this.name;
	}

	public boolean getFlag() {
		return this.flag;
	}

	public static boolean verifyKyc() throws InvalidInput {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your full name : ");
		name = sc.nextLine();
		System.out.println("Customer name is:  " + name.toUpperCase());

		System.out.println();
		System.out.print("Enter your age : ");
		int age = sc.nextInt();

		try {
			if (age < 18) {
				flag = false;
				throw new InvalidInput("Your are below 18");

			} else {
				flag = true;
				System.out.println("Customer age : " + age);
			}
		} catch (InvalidInput e) {
			System.out.println(e);
		}

		System.out.println();
		System.out.print("Please provide your 10 digit PAN number : ");
		panNumber = sc.nextInt();
		String s = Integer.toString(panNumber);
		try {
			if (s.length() != 10) {
				flag = false;
				throw new InvalidInput("Please enter valid 10 digit number. ");
			}
		} catch (InvalidInput e) {
			System.out.println(e);
		}

		System.out.println();
		if (flag) {
			System.out.println("Your kyc is successfully verified");
		} else {
			System.out.println("Your kyc is  failed to verify.");

		}
		return flag;

	}

}
