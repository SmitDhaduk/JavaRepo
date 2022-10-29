package dto;

import java.util.Iterator;

public class UsersDetails extends AccountHolder {


	public void searchAccountNumber(String name,int age,int pin) {
		for(User user:users) {
			if(user.getName().equals(name) && user.getAge()==age && user.getPin()==pin) {
				System.out.println("Your account number is: "+user.getAcNum());
			}
		}
	}
}
