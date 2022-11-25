package com.services;
import com.dto.UserBankDetails;
import com.dto.UserPersonalDetails;

public class AddBankImpl implements AddBank  {

	AccountsImpl ac = new AccountsImpl();
	public void addbank(String id) {

		System.out.println("Enter your Account number: ");
		String name = ac.sc.next();
		System.out.println("Enter balance : ");
		int amount = ac.sc.nextInt();

		for (UserPersonalDetails upd : ac.userList) {
			if (upd.getId().equals(id)) {
				ac.userBankList.add(new UserBankDetails(amount, name));
			}
		}
		System.out.println("Your bankDetails has been added successfully!!");
	}
}