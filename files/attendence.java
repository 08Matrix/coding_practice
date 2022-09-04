import java.util.Scanner;

public class attendence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter no. of classes held: ");
        float n = input.nextFloat();

        System.out.print("Enter no. of classes attended: ");
        float m = input.nextFloat();

        float count = (m / n) * 100;

        if (count > 75) {
            System.out.println("Your attendence is = " + count );
            System.out.println("Your allowed to sit in examination");}

        else {
            System.out.println("Your attendence is = " + count );
            System.out.println("Your not allowed to sit in examination");}
            
        input.close();    

    }
    
}
