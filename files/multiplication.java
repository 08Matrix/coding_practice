import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = s.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.print(n + "X" + i + "=" + (n * i));
            System.out.println();
        }
        s.close();
    }
}
