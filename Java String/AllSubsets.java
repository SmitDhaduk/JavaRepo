public class AllSubsets {
    public static void main(String[] args) {
        // This cide will print the subsets of the string. 
        // All the possible subsets for a string will be n(n+1)/2.
        // All possible subsets of a string "FUN" will be F, U, N, FU, UN, FUN.
        String str= "FUN";
        int len = str.length();
        String[] arr = new String[len*(len+1)/2];
        int temp = 0;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                arr[temp]=str.substring(i,j+1);
                temp++;

            }
        }
        System.out.println("All subsets of the given Stirngs are: ");
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
