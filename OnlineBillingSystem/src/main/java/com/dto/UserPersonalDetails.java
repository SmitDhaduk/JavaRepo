package com.dto;

import java.util.ArrayList;

public class UserPersonalDetails {

	@Override
	public String toString() {
		return "UserPersonalDetails [name=" + name + ", address=" + address + ", age=" + age + ", id=" + id + ", list="
				+ list + "]";
	}

	private String name;
	private String address;
	private int age;
	private String id;
	private ArrayList<UserBankDetails>list ;

	public UserPersonalDetails() {
	}

	public UserPersonalDetails(String name, String address, int age, String id,
			ArrayList<UserBankDetails> userBankDetails) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.id = id;
		this.list = (ArrayList<UserBankDetails>) userBankDetails;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ArrayList<UserBankDetails> getList() {
		return list;
	}

	public void setList(ArrayList<UserBankDetails> list ) {
		this.list = list;
	}
}
