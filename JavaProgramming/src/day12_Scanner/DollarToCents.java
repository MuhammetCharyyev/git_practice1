package day12_Scanner;

import java.util.Scanner;

public class DollarToCents {

    public static void main(String[] args) {

        Scanner convert = new Scanner(System.in);

        System.out.println("enter how many cents");
        int cents = convert.nextInt();
        int result = (cents/100);
        int result2 = (cents%100);

        System.out.println(cents + " cents equal to: " + result + " dollars and "+ result2 + " cents");

        /*
        Write a program that can convert cents to dollars, if there is any remainder include them in the result
         as cents
            Ex:
                Enter cents
                225

                output:
                225 cents equal to: 2 dollars and 25 cents
         */

convert.close();
    }
}
