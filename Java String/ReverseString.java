public class ReverseString {
    
    public static void main(String[] args) {
        String str = "Jpoint";
        String newStr=" ";
        char ch;
        // Stored character one by one into newStr;
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            newStr = ch+newStr;
        }
        System.out.println("Reversed String is: "+newStr);
    }
}
