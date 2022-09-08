import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
    
        System.out.print("Enter the number: ");
        int n = s.nextInt();

        int num = 1;

        if (n == 0) {
            System.out.print("The factorial of 0 = 0");
        }
        else {

            for (int i = 1; i <= n; i++) {
                num *= i;
            }
        
            System.out.print("The factorial of " + n + " = " + num);
        }    
        
        s.close();
    }
}
