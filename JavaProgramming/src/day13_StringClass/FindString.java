package day13_StringClass;

import java.util.Scanner;

public class FindString {

    public static void main(String[] args) {

        Scanner find = new Scanner(System.in);
        System.out.println("enter your word");
        String word = find.next();

        int lastChar = word.length();
        char lastOne = word.charAt(lastChar - 1);
        char lastTwo = word.charAt(lastChar - 2);
        char lastThree = word.charAt(lastChar - 3);

        if (lastChar > 3) {
            System.out.println(lastThree + "" + lastTwo + "" + lastOne);
        } else if (lastChar == 3) {
            System.out.println(word);
        } else {
            System.out.println("string is empty");
        }
        find.close();
        /*
        Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
         */

    }
}
