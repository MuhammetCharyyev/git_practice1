package day15_ForLoop;

import java.util.Scanner;

public class StartsWithX {

    public static void main(String[] args) {

        System.out.println("enter your word");
        String word = new Scanner(System.in).next(); // another method to Scanner if you have only one input
        // you can also do not worry about close the Scanner

        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x","a"); //"acodex" instead of "xcodex"
        }
        System.out.println(word);
    }
}
/*
Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */