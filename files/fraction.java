import java.util.Scanner;

public class fraction {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the numerator: ");
        int n = s.nextInt();

        System.out.print("Enter the denominator: ");
        int d = s.nextInt();

        if (d == 0) {
            System.out.println("Invalid input, denominator cannot be 0");
        }
        else {
            System.out.println("The fraction is: " + n + "/" + d);
            
            if (n < d) {
                int i = n;
                while (i >= 1) {
                    if (n % i == 0 && d % i == 0) {
                        System.out.println("The fraction in lowest terms is: " + n/i + "/" + d/i);
                        break;
                    }    
                    i--;    
                }
            }
            else if (d < n) {
                int i = d;
                while (i >= 1) {
                    if (n % i == 0 && d % i == 0) {
                        System.out.println("The fraction in lowest terms is: " + n/i + "/" + d/i);
                        break;
                    }    
                    i--;    
                }
            }
            else {
                System.out.println("The fraction in lowest terms is: 1/1");
            }
        }
        s.close();
    }
    
}
