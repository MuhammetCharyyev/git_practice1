package day15_ForLoop;

import java.util.Scanner;

public class SumScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = 0;
        System.out.println("enter number");
        int num=scan.nextInt();
        for (int i=1; i<=num; i++){

            number += i;
        }
        System.out.println(number);
        scan.close();

/*
write a program that can calculate the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */

    }
}
