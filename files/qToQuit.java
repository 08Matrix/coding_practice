import java.util.Scanner;

public class qToQuit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String choice = "";
        int sum = 0;
        int product = 1;
        int count = 0;

        while (!choice.equals("q")) {
            System.out.print("Enter a number or q to quit : ");
            choice = s.next();

            if (!choice.equals("q")) {
                int n = Integer.parseInt(choice);
                sum += n;
                product *= n;
                count++;
            }
        }
        System.out.println("Product is " + product+ " and average is " + ((float)sum/count));
        s.close();    
    }
}