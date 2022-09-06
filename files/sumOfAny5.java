import java.util.Scanner;

public class sumOfAny5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
         for (int i = 0; i < 5; i++) {
            System.out.print("Enter a number: ");
            sum += s.nextInt();
         }

         System.out.println("The sum is " + sum);

         s.close();
    }
    
}
