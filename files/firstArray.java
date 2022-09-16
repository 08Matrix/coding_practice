import java.util.Scanner;

public class firstArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number: ");
            int n = s.nextInt();

            arr[i] = n;
        }

        System.out.println("The numbers entered are: ");
        for (int j = 0; j < 10; j++) {
            System.out.print(arr[j] + " ");
        }
        s.close();
    }
}
