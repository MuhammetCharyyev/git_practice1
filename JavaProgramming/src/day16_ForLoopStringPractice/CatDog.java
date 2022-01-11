package day16_ForLoopStringPractice;

import java.util.SortedMap;

public class CatDog {

    public static void main(String[] args) {

        String sentence = "cat dog dog cat";
        int num1=0, num2=0;

       boolean hasCat = sentence.toLowerCase().contains("cat");
       boolean hasDog = sentence.toLowerCase().contains("dog");


       //for (int i = 0; i < sentence.length(); i++) {

           if (hasDog) {
               num1++;
           } else if (hasCat) {
               num2++;
           }

           if (num1 == num2) {
               System.out.println("true");
           } else {
               System.out.println("false");

           }


        /*
        write a program to print true if the string "cat" and "dog" appear the same number of times
        in the given sentence

	        Ex:
	            sentence = "caT dog dogG cAt"

	            output:
	                true
         */
    }
}
