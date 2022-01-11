package OfficeHours;

import java.util.Arrays;

public class MultipleWords {

    public static void main(String[] args) {

        String words = "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer";

String[] splitArr = words.split(", "); // transform to Array to split one String
                                            // to several elements and print out in one line

        System.out.println(Arrays.toString(splitArr));

        for (String eachWord : splitArr) {
            if(eachWord.contains(" ")){ // if each element contains space then print out
                System.out.println(eachWord);
            }
        }
    }
}
/*
 Task :  Write a program that accepts string and prints multiple words in the string

        "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge, dish washer”

        output : wooden spoons
                 trash can
                  dish washer
         */
