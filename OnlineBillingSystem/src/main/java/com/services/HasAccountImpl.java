package com.services;

import com.dto.UserPersonalDetails;

public class HasAccountImpl implements HasAccount {

	AccountsImpl accounts = new AccountsImpl();

	@Override
	public boolean checkUserHasAccount(String userId) {

		boolean result = false;
		for (UserPersonalDetails upd : accounts.userList) {

			if (upd.getId().equals(userId)) {
				result = true;
			} else {
				result = false;
			}

		}

		return result;
	}

}
