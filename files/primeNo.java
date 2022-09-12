import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = s.nextInt();
        
        int i, j, t;
        System.out.println("The prime numbers are: ");

        for (i = 1; i <= n; i++) {
            t = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    t++;
                    break;
                }
            }
            if (t == 0) {
                System.out.print(i + ", ");
            }
        }
        s.close();
    }
}
