import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        // if youser enter two strings with the same character then it will show both strings are ANAGRAM.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two String to check Anagram ;");
        System.out.println();
        // Here, if youser enter Str1= 'Brag'
        System.out.print("Enter frist String: ");
        String str1 = sc.nextLine();

        System.out.println();
        // Here, if youser enter Str2= 'Grab'
        System.out.print("Enter Second String: ");
        String str2 = sc.nextLine();
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            System.out.println("Both String are not Anagram.");
        } else {
            char[] string1 = str1.toCharArray();
            char[] string2 = str2.toCharArray();

            Arrays.sort(string1);
            Arrays.sort(string2);
        // here both the string1 and string2 has same character. hence both strings are ANAGRAM. 
            if(Arrays.equals(string1, string2)==true){
                System.out.println("Both the strings are Anagram ");
            }else{
                System.out.println("Both the strings are not Anagam");
            }
        }

    }
}
