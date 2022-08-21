import java.net.Socket;
import java.util.Scanner;

class LinearSearch {
    public static void main(String[] args) {
        // This code will give the index value of the choosen value from the array.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println();
        System.out.print("Enter the values into array: ");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the key value from the arrays");
        int key = sc.nextInt();

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                System.out.println("Index of " + key + " is " + i);
                break;

            }
        }
    }
}