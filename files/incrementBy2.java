public class incrementBy2 {
    public static void main(String[] args) {
        int n, first, second, third, fourth, s;

        n = 3475;

        first = n/1000;
        n = n%1000;
        second = n/100;
        n = n%100;
        third = n/10;
        fourth = n%10;

        s = ((first + 2) * 1000) + ((second + 2) * 100) + ((third + 2) * 10) + (fourth + 2);
        System.out.println("the new no. after incrementation is =" + s);

    }
    
}
