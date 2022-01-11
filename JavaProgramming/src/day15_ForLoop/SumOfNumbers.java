package day15_ForLoop;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        double sum =0; // or int
        //1+2=3+3=6+4...

        for (int i = 1; i < 101; i++) { //i: 1~100
            sum += i;
        }
        System.out.println(sum);

        System.out.println();
        System.out.println("__________________________________");

        int total =0; // ask user to enter 5 times

        Scanner scan = new Scanner(System.in);


        for (int i = 1; i < 6; i++) {
            System.out.println("enter number"); // statement inside the loop to avoid to repeat the same statement
            total+=scan.nextInt();
        }
        System.out.println(total);

        scan.close();



    }
}
