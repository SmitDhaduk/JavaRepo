public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 40, 25, 12, 3, 4 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while ((j > -1) && (arr[j] > key)) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        System.out.println("After Insertion Sort");
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

}
