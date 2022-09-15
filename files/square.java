import java.util.Scanner;

public class square {
    
    public static int getSquare(int x) {
        return (x * x);
    }
    //whenever square is required copy from here.

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = s.nextInt();

        int result = getSquare(n);

        System.out.println("Square of " + n + " is " + result);
        s.close();
    }
}
