package day15_ForLoop;

import java.util.SortedMap;

public class ForLoopPractices {

    public static void main(String[] args) {

        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");

        }

        System.out.println();
        System.out.println("hello"); //starts new line

        System.out.println("__________________________________");

        for (int i = 100; i >= 50; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("__________________________________");

        //print all even numbers between 1~55

        for (int i = 1; i<=55; i++){
            if (i%2==0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.println("__________________________________");

        //print all even numbers between 1~55 // another option

        for (int i = 2; i<=54; i+=2){// increasing by 2
            System.out.print(i + " ");
        }




    }
}
