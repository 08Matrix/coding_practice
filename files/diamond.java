import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = (n - i); j > 1; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();    
        }
        for (int i = n - 1; i > 0; i--) {
            System.out.print(" ");
            for (int j = (n - i); j > 1; j--) {
                System.out.print(" ");
            }
            for (int m = 0; m < i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }    
    s.close();    
    }
}
