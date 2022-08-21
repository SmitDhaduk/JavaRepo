import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        // This code will count number of Characters into String using For Lopp.ws
     
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String: ");
        String string = sc.nextLine();
        int count = 0;
        for(int i=0; i<string.length();i++){
            if(string.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println();
        System.out.println(string+" contains "+count+" characters. ");
    }
}
