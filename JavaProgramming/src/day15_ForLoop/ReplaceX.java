package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        System.out.println("enter your word");
        String word = new Scanner(System.in).next();

        String result=word.replace("x", "a").replace("X", "a");

        System.out.println(result);
    }
}
/*
 Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */