import java.util.Scanner;

public class firstArray {
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

        //printing all the elements present in the array.
        System.out.println("The numbers entered are: ");
        for (int j = 0; j < m; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println(" ");

        //printing all the positive numbers.
        System.out.println("The positive numbers are: ");
        for (int p = 0; p < m; p++) {
            if (arr[p] > 0) {
                System.out.print(arr[p] + " ");
            }
        }
        System.out.println(" ");

        //printing all the negative numbers.
        System.out.println("The negative numbers are: ");
        for (int g = 0; g < m; g++) {
            if (arr[g] < 0) {
                System.out.print(arr[g] + " ");
            }
        }
        System.out.println(" ");

        //printing all the 0s present in the array.
        System.out.println("all the 0s present in the array are: ");
        for (int p = 0; p < m; p++) {
            if (arr[p] == 0) {
                System.out.print(arr[p] + " ");
            }
        }
        System.out.println(" ");

        //printing all the even numbers.
        System.out.print("The even numbers are: ");
        for (int e = 0; e < m; e++) {
            if (arr[e] % 2 == 0) {
                System.out.print(arr[e] + " ");
            }
        }
        System.out.println(" ");
        
        //pirnting all the odd numbers.
        System.out.print("The odd numbers are: ");
        for (int o = 0; o < m; o++) {
            if (arr[o] % 2 != 0) {
                System.out.print(arr[o] + " ");
            }
        }
        System.out.println(" ");

        //asking the user for a number and checking if it is present in the array.
        int found = 0;
        System.out.print("Enter the number you want to check: ");
        int k = s.nextInt();
        for (int d = 0; d < m; d++) {
            if (arr[d] == k) {
                found = 1;
            }
        }
        if (found == 1) {
            System.out.print("Yes, the number you want to check is present");
        }
        else {
            System.out.print("No, the number you want to check is not present");
        }
        s.close();
    }
}
