import java.util.Scanner;

public class firstArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of elements you want to display: ");
        int m = s.nextInt();

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.print("Enter the number: ");
            int n = s.nextInt();

            arr[i] = n;
        }

        System.out.println("The numbers entered are: ");
        for (int j = 0; j < m; j++) {
            System.out.print(arr[j] + " ");
        }
        s.close();
    }
}
