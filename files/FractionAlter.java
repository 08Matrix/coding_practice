import java.util.Scanner;

public class FractionAlter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the numerator : ");
        int n = s.nextInt();

        System.out.print("Enter the denominator : ");
        int d = s.nextInt();

        int t, div, a, b;

        if (d == 0) {
            System.out.println("The denominator cannot be 0");
        }
        else if (n == 0) {
            System.out.println("The fraction in lowest terms is : 0/" + d);
        }
        else {
            if (n < d) {
                a = d;
                b = n;
            }
            else {
                a = n;
                b = d;
            }
            while (b != 0) {
                t = b;
                b = a % b;
                a = t;
            }
            div = a;
            System.out.println("The fraction in lowest terms is : " + n/div + "/" + d/div);
        }
        s.close();
    }
}
