package com.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import com.exceptions.InvalidInput;

public class RechargeImpl implements Recharge {
	SelectBankImpl sb = new SelectBankImpl();

	Scanner sc = new Scanner(System.in);

	public boolean verifyNumber(String number, String carrier) throws ParseException {
		boolean flag;
		if (number.length() == 10) {
			if ((number.trim().startsWith("90") || number.trim().startsWith("99")) && carrier.equals("Jio")) {
				recharge();
				flag = true;
			} else if ((number.trim().startsWith("97") || number.trim().startsWith("98"))
					&& carrier.equals("Vodaphone")) {
				recharge();
				flag = true;
			} else if ((number.trim().startsWith("96") || number.trim().startsWith("95")) && carrier.equals("Airtel")) {
				recharge();
				flag = true;
			}

			else if (number.trim().startsWith("99999") || number.trim().startsWith("88888")
					|| number.trim().startsWith("90000") || number.trim().startsWith("80000")) {
				recharge();
				flag = false;
			} else {
				System.out.println("not registered ");
				flag = false;
			}
		} else {
			System.out.println("Enter valid number!!");
			flag = false;
		}
		return flag;
	}

	public void recharge() throws ParseException {
		int balance = 0;
		do {
			try {
				System.out.println("Enter your account number: ");
				String acNum = sc.next();

				balance = sb.selectBank(acNum);
				if (balance == 0) {

					throw new InvalidInput("Enter valid Account Number");
				}

			} catch (InvalidInput e) {
				System.out.println(e);
			}
		} while (balance == 0);

		System.out.println("\n\nYour current balance: " + balance + "\n");
		System.out.print("Enter a amount you want to recharge: ");
		int amount = sc.nextInt();
		if (amount <= balance) {

			String dt = (java.time.LocalDate.now()).toString();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			c.setTime(sdf.parse(dt));
			c.add(Calendar.DATE, 28); // number of days to add
			dt = sdf.format(c.getTime());
			System.out.println("\nYour recharge has been done successfully!!\n\nIt will expire by " + dt);
			System.out.println("Updated balance in your A/c is: " + (balance - amount));
		} else {
			System.out.println("Transaction failed!!!!\nYou do not have sufficient balance in your account.");
		}
	}
}
