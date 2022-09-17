import java.util.Scanner;

public class reversingArray {
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

        //declaring a new array.
        int[] arr2 = new int[m];

        //reversing the array.
        for (int j = 0; j < m; j++) {
            arr2[j] = arr[(m - 1) - j];
        }

        //printing all the elements present in the array.
        System.out.println("The reversed array is: ");
        System.out.print("{");
        System.out.print(" ");
        for (int k = 0; k < m; k++) {
            System.out.print(arr2[k] + " ");
        }
        System.out.print("}");
        s.close();
    }
}
