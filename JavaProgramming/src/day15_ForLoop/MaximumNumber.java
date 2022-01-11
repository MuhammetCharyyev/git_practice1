package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int max = -2147483648; // assigning this min integer because any number will be entered by user will be greater
        //to allow the loop start working

        for (int i = 0; i < 5; i++) {
            System.out.println("enter number");
            int num=scan.nextInt();

            if (num>max){
                max=num;
            }
        }
        System.out.println(max);


    }
}
