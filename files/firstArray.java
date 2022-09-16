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
        System.out.println(" ");

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
