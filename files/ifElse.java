import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("enter the no. :");
        int n = input.nextInt();
        
        if(n > 0) {
            System.out.println("no. is positive");}

        else if(n < 0) {
            System.out.println("no. is negative");}
            
        else {
            System.out.println("no. is zero");}
        
        input.close();    


    }
    
}
