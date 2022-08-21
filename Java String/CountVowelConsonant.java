import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        // This code will count number of Consonants and Vowels form the given String.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        str = str.toLowerCase();
        int vCount=0;
        int cCount=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
             vCount++;
            }else if(str.charAt(i)>='a'&&str.charAt(i)<='z'){
                cCount++;
            }
        }
        System.out.println("Number of vowels: " + vCount);    
        System.out.println("Number of consonants: " + cCount);    

    }
}
