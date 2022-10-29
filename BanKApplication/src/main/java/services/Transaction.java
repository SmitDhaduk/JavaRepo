package services;

import java.util.Scanner;

import dto.AccountHolder;
import dto.User;

public class Transaction extends AccountHolder {
	

	public void withdraw(double withdrawAmount) {
		
		System.out.println("Enter your account number: ");
		
		Scanner sc = new Scanner(System.in);
		int acNum = sc.nextInt();
		
		double balance =accountDetail(acNum);
		System.out.println("Initial Amout: "+ balance);
		System.out.println("Updated Amount: "+ (balance - withdrawAmount));
		System.out.println("Thank for using our e-banking system!!");
	}
	
	public void deposite(double depositeAmount) {
		System.out.println("Enter your account number: ");
		Scanner sc = new Scanner(System.in);
		int acNum = sc.nextInt();
		double balance =	accountDetail(acNum);
		System.out.println("Amout: "+balance);
		System.out.println(" Updated Amount: "+ (balance + depositeAmount));
	}

}
