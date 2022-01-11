package day08_IfStatement;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        int number = 30;

        boolean evenNumber = number%2==0;

        if (evenNumber) {
            System.out.println(number + " is even number.");
        }else{
            System.out.println(number + " is odd number.");
        }

        if (!evenNumber) { // second option

            System.out.println(number + " is odd number.");
        }

        System.out.println("____________________________");

        int n = 220;

        // positive, negative, zero

        if (n >0){
            System.out.println(n+ " is positive");
        }
        if (n<0){
            System.out.println(n+ " is negative");
        }

        if (n==0){
            System.out.println(n+ " is zero");

        }





    }

}
