package day15_ForLoop;

import java.util.Scanner;

public class MInimumNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 2147483647; // max int number// any number user entered will be less

        for (int i = 0; i < 5; i++) {
            System.out.println("enter number");
            int num=scan.nextInt();

            if (num<min){
                min=num;
            }
        }
        System.out.println(min);


    }
}
