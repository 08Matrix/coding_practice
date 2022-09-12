public class armstrongNo {
    public static void main(String[] args) {
        int i, j, t;
        
        for (i = 1; i <= 1000; i++) {
            t = i;
            for (j = 0; t != 0; t /= 10) {
                j += (t % 10)*(t % 10)*(t % 10);
            }
            if (i == j) {
                System.out.println("yes working " + j);
            }
        }
    }
}
