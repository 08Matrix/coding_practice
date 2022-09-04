import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks < 25) {
            System.out.println("You grade is F");}
            
        else if (marks < 45) {
            System.out.println("You grade is E");}

        else if (marks < 50) {
            System.out.println("You grade is D");}

        else if (marks < 60) {
            System.out.println("You grade is C");}

        else if (marks < 80) {
            System.out.println("You grade is B");}

        else {
            System.out.println("You grade is A");}

        input.close();    
    
    }
}
