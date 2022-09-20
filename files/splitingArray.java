import java.util.Scanner;

public class splitingArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Creating an array.
        int [] arr = new int[10];

        //Taking input in the array.
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the number: ");
            int n = s.nextInt();
            arr[i] = n;
        }

        //Declaring new arrays.
        int [] arr2 = new int[5];
        int [] arr3 = new int[5];

        //Coping the arrays.
        System.arraycopy(arr, 0, arr2, 0, arr2.length);
        System.arraycopy(arr, 5, arr3, 0, arr3.length);
        
        //printing the arrays.
        System.out.println("Array 1 after spliting the main array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(" " + arr2[i]);
        }
        System.out.println("");
        System.out.println("Array 2 after spliting the main array: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(" " + arr3[i]);
        }
        s.close();
    }
}
