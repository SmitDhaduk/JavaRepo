public class RemoveWhiteSpace {
    public static void main(String[] args) {
        // This code will remove all the white space from the
        String str = "Remove white spaces";
        str = str.replaceAll("\\s+", "");
        System.out.println("After removing all the white space: "+str);
    }
    
}
