package day16_ForLoopStringPractice;

import java.util.Scanner;

public class StringContainsChar {

    /*

    Write a program that asks user to enter string and a char, the returns the frequency of the char
    from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';

                output: 3

                inputs:
                    "Java programming language"
                    'g'

                output: 4
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your string");
        String word = scan.nextLine();
        System.out.println("enter your character");
        String ch =  scan.next();

        int count = 0;

        for (int i =0; i<word.length(); i++) {

            if (ch.equalsIgnoreCase("" + word.charAt(i))) {
                count++;
            }
        }
        System.out.println(count);




    }
}
