import java.util.Scanner;

public class ReverseStrng {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        // This code will reverse the string.
        System.out.print("Enter any string: ");
        String str = sc.nextLine();
        String revStr = "";
        char ch;
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            revStr = ch+revStr;
        }
        System.out.println("Rerved String is: "+revStr);

    }
}
