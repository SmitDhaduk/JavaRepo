public class IndividualCharacters {
    public static void main(String[] args) {
        String str = "characters";
        
        // Displays individual characters from given string
        System.out.println("Individual characters from given string: ");
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

}
