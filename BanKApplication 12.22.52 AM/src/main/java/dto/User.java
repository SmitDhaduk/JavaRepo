package dto;

public class User {

	String name;
	int panNum;
	int age;
	int areaPin;
	int acNum;
	int pin;
	double balance;
	
	public User(String name, int panNum, int age, int areaPin, int acNum, int pin, double balance) {
		super();
		this.name = name;
		this.panNum = panNum;
		this.age = age;
		this.areaPin = areaPin;
		this.acNum = acNum;
		this.pin = pin;
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getBalance() {
		return balance;
	}

	public int getPanNum() {
		return panNum;
	}
	
	public int getAge() {
		return age;
	}
	
	
	
	public int getAreaPin() {
		return areaPin;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", panNum=" + panNum + ", age=" + age + ", areaPin=" + areaPin
				+ ", acNum=" + acNum + ", pin=" + pin + ",balance=" + balance + "]";
	}
	public int getAcNum() {
		return acNum;
	}
	
	public int getPin() {
		return pin;
	}
		
}
