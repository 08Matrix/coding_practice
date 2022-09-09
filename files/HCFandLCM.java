import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float b, lcm;

        System.out.print("Enter the first number: ");
        float n = s.nextFloat();

        System.out.print("Enter the second number: ");
        float m = s.nextFloat();

        if (m <= 0 || n <= 0) {
            System.out.println("Input cannot be 0 or negative");
        }
        else {

            float product = n * m;

            lcm = (n > m) ? n : m;
        
            while(lcm <= product) {
                if (lcm % n == 0 && lcm % m == 0) {
                
                    System.out.println("the LCM is " + lcm);
                
                    b = product / lcm;
                    System.out.println("the HCF is " + b);
                
                    break;
                }
                lcm++;
            }
        }    
        s.close();
    }
}
