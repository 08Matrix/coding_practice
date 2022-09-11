import java.util.Scanner;

public class sumOfdigitsAlter {
    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int i, n = m.nextInt();
        m.close();

        for (i = 0; n != 0 ; n /= 10) {
            i += (n % 10);
        }
        System.out.println("Sum of the digits is : " + i);
    }
}
