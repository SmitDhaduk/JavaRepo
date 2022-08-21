public class DivideString {
    public static void main(String[] args) {
        // This code will divide string into 3 equal parts.
        String str = "aaaabbbbcccc";
        int len = str.length();
        int numOfParts = 3;
        int chars = len / numOfParts;
        int temp = 0;
        String[] equalStr = new String[numOfParts];

        if (len % numOfParts != 0) {
            System.out.println("Given string can not be devided..");
        } else {
            for (int i = 0; i < len; i= i+chars) {
                String part = str.substring(i, i + chars);
                equalStr[temp] = part;
                temp++;
            }
        }
        System.out.println(numOfParts + " equal parts of given string is: ");
        for (int i = 0; i < equalStr.length; i++) {
            System.out.println(equalStr[i]);
        }
    }

}
