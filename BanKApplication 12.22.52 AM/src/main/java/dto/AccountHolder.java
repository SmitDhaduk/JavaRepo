package dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import exceptions.InvalideInput;

public class AccountHolder {

	int acNumber;

	static List<User> users = new ArrayList<User>();

	public static boolean accountHolder() {

		boolean result = false;
		int acNum = (int) (Math.random() * 1000000000 + 999999999);
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.print("Enter your full name: ");
		String name = sc.nextLine();
		

		System.out.print("Enter your PAN Number: ");
		int panNum = sc.nextInt();
		
		String s = Integer.toString(panNum);
		
		while(s.length() != 8) {
			try {
				//result = true;
				throw new InvalideInput("Please enter 8-digit valide PAN number ");

			} catch (InvalideInput e) {
				System.out.println(e);
				System.out.print("Enter your PAN Number: ");
				panNum = sc.nextInt();
				s = Integer.toString(panNum);
			}

		}
		
		
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		try {
			if (age < 18) {
				result = true;
				throw new InvalideInput("You are below 18");

			}
		} catch (InvalideInput e) {
			System.out.println(e);
		}

		System.out.print("Enter your area pin: ");
		int areaPin = sc.nextInt();
		String str = Integer.toString(areaPin);
		try {
			if (str.length() != 6) {
				result = true;
				throw new InvalideInput("Area code must have 6-digit.");
			}
		} catch (InvalideInput e) {
			System.out.println(e);
		}
		System.out.println();
		System.out.print("Enter your pin: ");
		int pin = sc.nextInt();

		System.out.println("Please diposite atleast 500 to open account.");

		double amount = sc.nextDouble();
		try {
			if (amount < 500) {
				result = true;
				throw new InvalideInput("Enter amout is below 500.");
			}
			
		} catch (InvalideInput e) {
			System.out.println(e);
		}
		if(!result) {
		users.add(new User(name, panNum, age, areaPin, acNum, pin, amount));

		System.out.println();
		System.out.println("Your account has been created successfully!!");
		System.out.println();
		}else {
			System.out.println("Please enter currect information!\nPlease fill it again!");
		}
		return result;
	}

	public double accountDetail(int acNumber) {
		double netBalance = 0;
		for (User user : users) {
			if (user.getAcNum() == acNumber) {
				netBalance = user.getBalance();
			}
		}
		return netBalance;
	}
	
	public List<User> listAc(int pass){
		for(User user:users) {
			if(user.getPin()==pass) {
				String name = user.getName();
				int ac = user.getAcNum();
				System.out.println(name+" "+ac);
			}
			
		}
		return users;
	}
}
