public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 1, 20, 30, 25, 24, 39, 40 };
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;

                }
            }

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);

        }

    }

}
