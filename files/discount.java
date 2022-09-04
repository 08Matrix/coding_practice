import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int n = input.nextInt();

        int price = n * 100;
        int discount = n * 10;

        if (n > 1000) {
            price = price - discount;
            System.out.print("Total price : " + price);}
            
        else {
            System.out.print("Total price : " + price);}
            
        input.close();    

    }
    
}
