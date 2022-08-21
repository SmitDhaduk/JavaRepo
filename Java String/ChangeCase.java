public class ChangeCase {
    public static void main(String[] args) {
        // This code will change the low case to upper case and vice versa
        String str = "Smit Dhaduk";
        StringBuffer newStr = new StringBuffer(str);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isLowerCase(str.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            } else if (Character.isUpperCase(str.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
        }
        System.out.println("String after case conversion :" + newStr);

    }

}
