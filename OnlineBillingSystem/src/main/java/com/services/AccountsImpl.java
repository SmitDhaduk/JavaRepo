package com.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.dto.UserBankDetails;
import com.dto.UserPersonalDetails;

public class AccountsImpl implements Accounts {
	
	static String accNum;
	static List<UserPersonalDetails> userList = new ArrayList<UserPersonalDetails>();
	static ArrayList<UserBankDetails> userBankList = new ArrayList<UserBankDetails>();
	static Scanner sc = new Scanner(System.in);

	public static  void addAccount() {


		System.out.println("Enter your mail id: ");
		String mailId = sc.next();

		
		System.out.println("Enter your name");
		String name = sc.next();

		System.out.println("Enter your location: ");
		String addr = sc.next();

		System.out.println("Enter your age: ");
		int age = sc.nextInt();

		System.out.println("Please fill out your bank information\n");

		System.out.println("Enter your bank balance: ");
		int balance = sc.nextInt();

		System.out.println("Enter your account Number: ");//
		 accNum = sc.next();

		 userBankList = new ArrayList<UserBankDetails>();
		userBankList.add(new UserBankDetails(balance, accNum));
		
		userList.add(new UserPersonalDetails(name, addr, age, mailId, userBankList));

	}

}
