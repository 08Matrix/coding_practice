import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year of service : ");
        int n = input.nextInt();

        System.out.print("Enter salary : ");
        int s = input.nextInt();

        int bonus = (s / 100) *5;
        
        if (n > 5) {
            System.out.println("Bonus is " + bonus);}

        else {
            System.out.println("Sorry their is no bonus");}
            
        input.close();

    }
    
}
