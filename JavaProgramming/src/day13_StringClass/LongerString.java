package day13_StringClass;

import java.util.Scanner;

public class LongerString {

    public static void main(String[] args) {

        Scanner find = new Scanner(System.in);

        System.out.println("enter your first word");
        String firstWord = find.next();
        int numberCharacters = firstWord.length();


        System.out.println("enter your second word");
        String secondWord = find.next();
        int numberCharacters2 = secondWord.length();

        if (numberCharacters > numberCharacters2){
            System.out.println(firstWord + " is longer");

        }else{
            System.out.println(secondWord + " is longer");
        }
find.close();



        /*
        write a program that asks user to enter two strings, and print out the longest string

         */

    }
}
