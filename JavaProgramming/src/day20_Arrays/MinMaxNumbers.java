package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter a number"); // this number will be repeated 10 times as indicated in array
            numbers[i] =scan.nextInt(); // each user entered input will be assigned to indexes of the array num
        }

        int max = numbers[0];
        int min = numbers [0];

        for (int i = 0; i < numbers.length; i++) {

            if(numbers[i] >max){
                max=numbers[i];
            }

            if(numbers[i] <min){
                min=numbers[i];
            }

            System.out.println( min );
            System.out.println( max);
            System.out.println(Arrays.toString(numbers)); // only to print array

        }

    }

}
