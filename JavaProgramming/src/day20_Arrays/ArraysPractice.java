package day20_Arrays;

import java.util.Arrays;
import java.util.SortedMap;

public class ArraysPractice {

    public static void main(String[] args) {

        // store elements: 10,20,50,70

        int[] numbers = {10,20,50,70};// size: 4 elements

        System.out.println(Arrays.toString(numbers));

        System.out.println("____________________________________");

        // create variable that contain 5 scores

        int[] scores = new int[5]; // 5 elements and no more // [0,0,0,0,0] by default
        scores[1]=85;
        scores[scores.length-1]= 95; // if you don't know the length of value
        scores[3]=75;
        scores[0]=65;
        scores[2]=55;

        System.out.println(Arrays.toString(scores));




    }

}
