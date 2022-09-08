import java.util.Scanner;

public class diamondNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no. of rows: ");
        int n = s.nextInt();
 
        for (int i = 1; i <= n; i++) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        for (int i = n -1; i > 0; i--) {
            for (int j = (n - i); j >= 1; j--) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("0 ");
                }
                else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
        s.close();
    }
    
}
