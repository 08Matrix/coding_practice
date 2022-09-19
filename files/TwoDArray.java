public class TwoDArray {
    public static void main(String[] args) {
        // Creating a new 2d Array.
        int [][] arr = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};

        //Looping through the array.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" " + arr[i][j]);
            }
        }
    }
}
