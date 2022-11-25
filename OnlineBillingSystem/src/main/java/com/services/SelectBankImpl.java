package com.services;

import com.dto.UserBankDetails;
import com.exceptions.InvalidInput;

public class SelectBankImpl implements SelectBank {

	AccountsImpl ac = new AccountsImpl();
	int amount;
	boolean result;

	public int selectBank(String accNum) {

		for (UserBankDetails usb : ac.userBankList) {
			if (usb.getAccoutNum().equals(accNum)) {
				result = true;
				amount = usb.getBalance();
			}
		}

		return amount;
	}
}
