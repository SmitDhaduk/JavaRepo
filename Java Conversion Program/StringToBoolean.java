public class StringToBoolean {
 
    public static void main(String[] args) {
        String str1="true";
        String str2 ="True";
        String str3 = "ok";
        boolean b1 = Boolean.parseBoolean(str1);
        boolean b2 = Boolean.parseBoolean(str1);
        boolean b3 = Boolean.parseBoolean(str1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);


    }
}
