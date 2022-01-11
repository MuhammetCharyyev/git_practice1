package day19_LoopsPractices;

import java.util.Scanner;

public class CalculatorSystemExit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int num1 = scan.nextInt();

        System.out.println("enter math operator");
        char operator = scan.next().charAt(0); // to return String to char need to add charAt(0) method

        if ( !(operator=='+'|| operator=='-') ) { // if the operator is not valid
            System.err.println("invalid math operator: "+operator);
            System.exit(0); // terminate and exit the program at all without further processing

        }

        System.out.println("enter number");
        int num2 = scan.nextInt();

        if(operator=='-'){
            System.out.println(num1-num2);
        }else{
            System.out.println(num1+num2);
        }



    }


}
