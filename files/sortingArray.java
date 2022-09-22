import java.util.Arrays;

public class sortingArray {
    public static void main(String[] args) {
        int[] array = {3,5,2,1,6,8,7,4};
        Arrays.sort(array);

        for (int i: array) {
            System.out.print(i + ",");
        }
    }    
}
