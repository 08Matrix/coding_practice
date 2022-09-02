public class sumOfdigits {
    public static void main(String[] args) {
        int n, first, second, third, s;

        n = 437;

        first = n/100;
        n = n%100;
        second = n/10;
        third = n%10;

        s = (first + second + third);
        System.out.println("the total sum of the digits is =" + s);
    }
    
}
