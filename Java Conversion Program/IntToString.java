public class IntToString {
    public static void main(String[] args) {
        int i = 100;
        String str = String.valueOf(i);

        // 300 because + is binary plus operator
        System.out.println(i + 100);

        // 200100 because + is string concatenation operator
        System.out.println(str + 100);
    }
}
