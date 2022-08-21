import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");

        String str = sc.nextLine();
        String newStr = " ";
        char ch;

        // This code will check the given string is Palindrome or not.
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            newStr = ch + newStr;

        }
        if (str == newStr) {
            System.out.println("Given string is Palindrome String");
        } else {
            System.out.println("Given string is not Palindrome String");

        }
    }

}
