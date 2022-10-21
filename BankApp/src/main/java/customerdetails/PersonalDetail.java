package customerdetails;

import java.util.Scanner;

public class PersonalDetail extends Account{
	
	public static boolean result = false;
	
	public static boolean personalDetail(int ac,int pass) {
		if(acNum == ac && pin==pass) {
			result=true;
		}		
		return result;
	}
}
