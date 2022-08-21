public class ReplaceSpace {
    public static void main(String[] args) {
        // This code will replace all the spaces present in the string with a specific character. 
        String str = "Once in a blue moon";
        char ch ='-';
        str = str.replace(' ', ch);
        System.out.println("String after replacing spaces with given character: "+str);
    }
    
}
