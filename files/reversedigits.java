public class reversedigits {
    public static void main(String[] args) {
        int n, first, second, third, s;

        n = 567;

        first = n/100;
        n = n%100;
        second = n/10;
        third = n%10;

        third = third - first;
        first = first + third;
        third = first - third;

        s = (first * 100) + (second * 10) + third;
        System.out.println("the new no. is = " + s);

    }
    
}
