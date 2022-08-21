public class DuplicateWordInString {
    public static void main(String[] args) {
        String str = "Big black bug bit a big black dog on his big black nose";

        //Converts the string into lowercase    
        str = str.toLowerCase();

        //Split the string into words using built-in function 
        String[] words = str.split(" ");
        int count;
        for (int i = 0; i < words.length; i++) {
            count=1;
            for (int j = i + 1; j < words.length; j++) {

                if(words[i].equals(words[j])){
                    count++;

                    //Set words[j] to 0 to avoid printing visited word    
                    words[j]="0";
                }
            }
               //Displays the duplicate word if count is greater than 1    
            if(count>1&&words[i]!="0"){
                System.out.println(words[i]);
            }
        }

    }
}
