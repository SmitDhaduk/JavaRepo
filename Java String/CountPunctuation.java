import java.util.Scanner;

public class CountPunctuation {

    public static void main(String[] args) {
        // This code will count number of punctuations present into sentance.
        Scanner sc = new Scanner(System.in);
        System.out.println("Write a sentance which contains punctuations");
        String str = sc.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.'
                    || str.charAt(i) == '?' || str.charAt(i) == '-' ||
                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')

                count++;

        }
        System.out.println("Number of punctuation in sectance is " + count);
    }
}
