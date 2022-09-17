import java.util.Scanner;

public class sumProductArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //asking for the number of elements in the array.
        System.out.print("Enter number of elements you want to display: ");
        int m = s.nextInt();

        //declaring the array.
        int[] arr = new int[m];

        //taking the input in the array.
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the number: ");
            int n = s.nextInt();

            arr[i] = n;
        }

        int sum = 0, product = 1;

        //finding the sum of the array.
        for (int j = 0; j < m; j++) {
            sum += arr[j];
        }
        System.out.println("The sum of the array is: " + sum);

        //finding the product of the array.
        for (int p = 0; p < m; p++) {
            product *= arr[p];
        }
        System.out.println("The product of the array is: " + product);

        s.close();
    }
}
