import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter anything : ");
        String anything = input.next();
        System.out.println("you entered : " + anything);

        input.close();

    }

}
