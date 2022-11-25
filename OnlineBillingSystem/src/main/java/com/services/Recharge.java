package com.services;

import java.text.ParseException;

public interface Recharge {

	public boolean verifyNumber(String number, String carrier)throws ParseException;
	public void recharge()throws ParseException;
}
