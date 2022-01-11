package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class For_Each_Loop_Intro {

    public static void main(String[] args) {

        int[] numbers ={10, 20, 30,40,50,60,70,80,90,100};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i]; // to get each element
            System.out.println(eachElement);
        }

        for (int each : numbers) { // get all elements from begining till the end// faster option to get all arrays
            System.out.println(each); // you cannot use this for each loop for reverse or for separate indexes
        }



    }

}
