package bankapp;

import java.util.Scanner;

import services.Proccess;
import services.Transaction;

public class BankApp {

	public static void main(String[] args) {

		System.out.println("Welcome to our banking e-service!");
		System.out.println("To access our services you need to first open Account");
		Proccess pc = new Proccess();
		pc.process();
		

	}
}
