import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = s.nextInt();
        
        int i, j, t;

        for (i = 1; i <= n; i++) {
            t = 0;
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    t++;
                    break;
                }
            }
            if (t == 0) {
                if (n % i == 0 && i > 1) {
                    System.out.println(i + " is a prime factor of " + n);
                }
            }
        }
        s.close();
    }
}
