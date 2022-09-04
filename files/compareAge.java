import java.util.Scanner;

public class compareAge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Person 1 enter your age: ");
        int age1 = input.nextInt();

        System.out.print("Person 2 enter your age: ");
        int age2 = input.nextInt();

        System.out.print("Person 3 enter your age: ");
        int age3 = input.nextInt();

        if ((age1 > age2)&&(age1 > age3)) {
            if (age2 > age3){
                System.out.println("person 1 is oldest and person 3 is youngest");}
            else {
                System.out.println("person 1 is oldest and person 2 is youngest");}
        }

        if ((age2 > age1)&&(age2 > age3)) {
            if (age1 > age3) {
                System.out.println("person 2 is oldest and person 3 is youngest");}
            else {
                System.out.println("person 2 is oldest and person 1 is youngest");}
        }

        else if ((age3 > age1)&&(age3 > age2)) {
            if (age1 > age2) {
                System.out.println("person 3 is oldest and person 2 is youngest");}
            else {
                System.out.println("person 3 is oldest and person 1 is youngest");}
        }

        input.close();    

    }
}
