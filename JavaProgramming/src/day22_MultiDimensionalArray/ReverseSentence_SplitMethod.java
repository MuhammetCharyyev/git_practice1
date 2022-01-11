package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence_SplitMethod {

    public static void main(String[] args) {

        String sentence ="Today is a good day to learn Java";

        String[] words = sentence.split(" "); // you can get each word one by one and store in array

        System.out.println(Arrays.toString(words));  // [Today, is, a, good, day, to, learn, Java]

        String reversed = ""; //  need to make "Java learn to day good a is Today"

        for (int i = words.length - 1; i >= 0; i--) {
            reversed+=words[i] + " "; // " " will add space between words
        }

        System.out.println("reversed = " + reversed);

    }

}
/*
Write a program that can reverse a sentence
            Ex:
                sentence = "Today is a good day to learn Java";

            output:
                Java learn to day good a is Today
 */