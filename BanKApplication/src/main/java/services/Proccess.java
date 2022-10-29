package services;

import java.util.Scanner;

import dto.AccountHolder;
import dto.UsersDetails;

public class Proccess extends AccountHolder {

	static Scanner sc = new Scanner(System.in);
	static int value;
	static boolean flag;

	public static void process() {

		AccountHolder open = new AccountHolder();
		open.accountHolder();
		
		if (flag) {
			open.accountHolder();
		} else {
			
			do {

				System.out.println();
				System.out.println("Press 1 to add another Account");
				System.out.println("Press 2 to do some transation");
				System.out.println("Press 3 to check your info");
				System.out.println("Press 4 to Exit process");
				value = sc.nextInt();
				if (value == 1) {
					System.out.println("please fill info to create new ac");
					open.accountHolder();
				} else if (value == 2) {

					System.out.println();
					System.out.println("Press 1 to deposite money.\nPress 2 to withdraw money.");
					Transaction ts = new Transaction();
					int y = sc.nextInt();
					if (y == 1) {
						System.out.println("Please give currect Anser to deposite:");
						System.out.println("What is your name: ");
						String name = sc.next();

						System.out.println("Enter your age: ");
						int age = sc.nextInt();

						System.out.println("Enter your four digit ");
						int pin = sc.nextInt();

						UsersDetails userd = new UsersDetails();
						userd.searchAccountNumber(name, age, pin);
						System.out.print("Enter amout to deposite: ");
						double dAmount = sc.nextDouble();
						ts.deposite(dAmount);
					} else if (y == 2) {
						System.out.println("Please give currect Anser to withdraw:");
						System.out.println("What is your name: ");
						String name = sc.next();

						System.out.println("Enter your age: ");
						int age = sc.nextInt();

						System.out.println("Enter your four digit ");
						int pin = sc.nextInt();

						UsersDetails userd = new UsersDetails();
						userd.searchAccountNumber(name, age, pin);
						System.out.print("Enter amout to withdraw: ");
						double wAmount = sc.nextDouble();
						ts.withdraw(wAmount);
					}
				} else if (value == 3) {
					System.out.println("Please give currect Anser to access your information.");
					System.out.println("What is your name: ");
					String name = sc.next();

					System.out.println("Enter your age: ");
					int age = sc.nextInt();

					System.out.println("Enter your four digit ");
					int pin = sc.nextInt();

					UsersDetails userd = new UsersDetails();
					userd.searchAccountNumber(name, age, pin);

				}
			} while (value != 4);
		}

	}
}