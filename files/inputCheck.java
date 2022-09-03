import java.util.Scanner;

public class inputCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the first no. :");
        int n1 = input.nextInt();
        
        System.out.print("enter the second no. :");
        int n2 = input.nextInt();

        System.out.print("enter the third no. :");
        int n3 = input.nextInt();

        System.out.print("when using && :");
        System.out.println(n1 == n2 && n3 == n1 && n2 == n3);

        System.out.print("when using || :");
        System.out.println(n1 == n2 || n3 == n1 || n2 == n3);

        input.close();
    }
    
}
