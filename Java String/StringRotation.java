public class StringRotation {
    
    public static void main(String[] args) {
        //  This code will check whether a string is a rotation of another string or not.
        String str1="abcde", str2="deabc";
        if(str1.length()!=str2.length()){
            System.out.println("Second string is not rotation of first ");
        }else{
             //Concatenate str1 with str1 and store it in str1   
            str1 = str1.concat(str2);
            //Check whether str2 is present in str1    
            if(str1.indexOf(str1)!=-1){
                System.out.println("Second string is a rotation of first string");
            }else{
                System.out.println("Second string is not rotation of first string");

            }
        }
    }
}
