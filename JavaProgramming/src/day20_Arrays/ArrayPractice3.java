package day20_Arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("how many num would you like to enter?");
        int length = scan.nextInt();

        if(length<=0){
            System.err.println("invalid");
            System.exit(0);
        }

        int[] numbers = new int[length]; // allows to enter arrays ==> concerns to the entering
        // "how many num would you like to enter?"

        // array needs to have enough capacity to contain all elements user is going to enter

        for (int i = 0; i < length; i++) { // indicate indexes from 0 to length of input of Scanner
            System.out.println("enter a number");
            numbers[i]=scan.nextInt(); // "number" as array has to conclude [i] as number which should
            // be printed in output finally  as set in array
        }

        System.out.println(Arrays.toString(numbers));


    }

}
