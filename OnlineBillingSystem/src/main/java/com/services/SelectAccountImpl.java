package com.services;

import com.dto.UserPersonalDetails;

public class SelectAccountImpl implements SelectAccount {

	AccountsImpl accounts = new AccountsImpl();

	public int user(String userId) {
		int index = 0;
		for (UserPersonalDetails upd : accounts.userList) {

			if (upd.getId().equals(userId)) {
				index = accounts.userList.indexOf(upd);
			}
		}
		return index;
	}
}
