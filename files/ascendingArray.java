import java.util.Scanner;

public class ascendingArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Asking for the size of the array.
        System.out.print("Enter the number of elements you want to enter in the array: ");
        int size = s.nextInt();

        //Creating the array.
        int [] arr = new int[size];

        //Taking input in the array.
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number: ");
            int n = s.nextInt();
            arr [i] = n;
        }

        //declaring a variable
        int b = 0;

        //sorting the array.
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size - i; j++) {
                if (arr[i - 1] > arr[i + j]) {
                    b = arr[i - 1];
                    arr[i - 1] = arr[i + j];
                    arr[i + j] = b;
                }
            }
        }

        //printing all the elements present in the array.
        System.out.println("The numbers entered are: ");
        for (int j = 0; j < size; j++) {
            System.out.print(arr[j] + " ");
        }
        s.close();
    }
}