package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord_Split {

    public static void main(String[] args) {

        String sentence = "I Love Java";

        String [] words = sentence.split( " "); // you can get each word one by one and store in array

        System.out.println(Arrays.toString(words)); //[I, Love, Java]

        String reversed = "";

        for (int i = words[1].length()-1; i >= 0; i--) { // word[1] will find the second index in the array
            reversed+=words[1].charAt(i); // will add found 2nd index in the array and reversed by charAt(i) to
            // the String reversed
        }

        System.out.println("reversed = " + reversed);

     //   sentence = sentence.replaceFirst(words[1], reversed); // replace the 2nd index in the array by reversed one

        words[1] = reversed; // replace the 2nd index in the array by reversed one// you change meaning the
        // second index by new meaning

        System.out.println(Arrays.toString(words));

        for (String word : words) { // for each loop will help to check every index in array and reverse the needed one
            System.out.println(word+" "); // will print each index in the array one by one in column
        }



    }

}
/*
Write a program that can reverse the second word of the sentence
            Ex:
                sentence = "I Love Java";

            output:
                I evoL Java
 */