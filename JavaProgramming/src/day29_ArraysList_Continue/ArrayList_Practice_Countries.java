package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice_Countries {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "USA", "Turkey", "United Kingdom", "Canada"};
// need to remove countries that exceed 10 letters
        // first: convert Array to ArrList

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));
                                                              // () insert here string name
        //remove all that greater or equal than 10 characters
        list.removeIf(p-> p.length()>=10);

        countries = list.toArray(new String[0]);//converting ArrList back to Array
                                               // need to assign and set a size in [],
                                               // by default you may set [0]
        //removes all countries that contains more than 10 characters
        System.out.println(Arrays.toString(countries)); //[Japan, Korea, USA, Turkey, Canada]

    }

}

/*
1. create an Array of string called countries
2. write a program that can remove all the country names that have length of 10 or greater
 */
