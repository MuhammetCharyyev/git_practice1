package day13_StringClass;

import java.util.Scanner;

public class FirstLast {

    public static void main(String[] args) {

        Scanner sentence = new Scanner(System.in);

        System.out.println("Enter your sentence");
        String enter = sentence.nextLine();

        char first = enter.charAt(0);
        char last = enter.charAt(enter.length()-1);

        System.out.println("first = " + first);
        System.out.println("last = " + last);

         sentence.close();

        /*
        write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
         */

    }
}
