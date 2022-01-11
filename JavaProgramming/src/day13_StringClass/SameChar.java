package day13_StringClass;

import java.util.Scanner;

public class SameChar {

    public static void main(String[] args) {

        Scanner find = new Scanner(System.in);

        /*
        write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
         */

        System.out.println("enter your word");
        String word = find.next();

        char firstChar = word.charAt(0);
        char lastChar = word.charAt(word.length()-1);

        if (firstChar==lastChar){
            System.out.println("same");
        }else {
            System.out.println("not same");
        }

find.close();

    }
}

