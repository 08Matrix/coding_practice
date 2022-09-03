import java.util.Scanner;

public class personalIntro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = input.next();

        System.out.print("enter your roll no. : ");
        int roll = input.nextInt();

        System.out.print("enter your field of interest: ");
        String interest = input.next();

        System.out.println("Hey, my name is " + name + " and my roll number is " + roll + ". My field of interest is " + interest + ".");

        input.close();

    }

    
}
