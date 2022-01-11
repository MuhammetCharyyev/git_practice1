package day17_WhileLoop;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter first num");
        int num1 = scan.nextInt();
        System.out.println("enter second num");
        int num2 = scan.nextInt();

        // +,- valid math operators

        System.out.println("enter math operator");
        char ch = scan.next().charAt(0); //

       /* if(!(ch=='+')||(ch=='-')){ // this will be repeated only one time, but I need to repeat invalid operator till true
            System.err.println("invalid, please re-enter");
            ch = scan.next().charAt(0);
        }

        */

        while(!(ch=='+')||(ch=='-')){ // if the operator valid// while loop is useful for this, it is executed till true
            System.err.println("invalid, please re-enter");
            ch = scan.next().charAt(0);
        }

        System.out.println((ch=='+')? num1+num2: num1-num2);


    }
}
