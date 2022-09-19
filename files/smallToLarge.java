import java.util.Scanner;

public class smallToLarge {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Asking for the size of the array.
        System.out.print("Enter the number of elements you want to enter in the array: ");
        int size = s.nextInt();

        //Creating the array.
        int [] arr = new int[size];

        //Taking input in the array.
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number: ");
            int n = s.nextInt();
            arr [i] = n;
        }

        //Declaring the variables.
        int sm = arr [0], lr = arr [0];

        //Finding the smallest element in the array.
        for (int i = 1; i < arr.length; i++) {
            if (arr [i] < sm) {
                sm = arr [i];
            }
            if (arr [i] > lr) {
                lr = arr [i];
            }
        }

        //Printing the smallest and largest elements of the array.
        System.out.print("The smallest element of the array is: " + sm);
        System.out.println(" ");
        System.out.print("The largest element of the array is: " + lr);
        s.close();

    }
}
