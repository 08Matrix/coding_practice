public class sumOf1And4 {
    public static void main(String[] args) {
        int n, first, second, third, fourth, fifth;

        n = 23456;

        first = n/10000;
        n = n%10000;

        second = n/1000;
        n = n%1000;

        third = n/100;
        n = n%100;

        fourth = n/10;

        fifth = n%10;

        System.out.println("1st digit is" + first);
        System.out.println("2nd digit is" + second);
        System.out.println("3rd digit is" + third);
        System.out.println("4th digit is" + fourth);
        System.out.println("5th digit is" + fifth);
        System.out.println("sum of 1st and 4th is =" + (first + fourth));

    }
    
}
