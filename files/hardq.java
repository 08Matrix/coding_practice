public class hardq {
    public static void main(String[] args) {
        int totalNoOfStudents = 90; //given
        int noOfBoys = (totalNoOfStudents * 50) / 100;
        int noOfGirls = (totalNoOfStudents - noOfBoys);
        int noOfA = (totalNoOfStudents * 50) / 100;
        int noOfBoysA = 20; //given
        int noOfGirlsA = (noOfA - noOfBoysA);
        System.out.println("total no. of girls in the class is = " + noOfGirls);
        System.out.println("total no. of girls who got a A = " + noOfGirlsA);


    }
    
}
