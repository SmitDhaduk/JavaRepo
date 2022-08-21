public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 10, 30, 20, 40, 70, 50 };
        for(int i=0;i<arr.length;i++){
            int index = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
                
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
    }
   

}
