import java.util.Scanner;

public class areaInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter length :");
        int length = input.nextInt();

        System.out.print("enter breath :");
        int breath = input.nextInt();

        int area = (length * breath);

        System.out.println("area : " + area);

        input.close();
    
    }

}    
