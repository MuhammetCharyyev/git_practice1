package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters_FrequencyMethod {

    public static void main(String[] args) {

        String str = "aabbbbccdeef";
        
        String[]arr = str.split(""); // every element will be split by space
 //if we create String[]arr = str.split then we may use Arrays.asList( arr)
//to convert string to ArrList and then use all methods of ArrList as below
        ArrayList<String> list = new ArrayList<>(Arrays.asList( str.split("")));
                                                              // will be split by space       
        
        System.out.println("list = " + list); //list = [a, a, b, b, b, b, c, c, d, e, e, f]

        System.out.println("______________________________________________");
        
        String unique = ""; //find unique char from ArrList

        for (String each : list) {
           int frequency= Collections.frequency(list, each); //find frequency and assign to int
            if (frequency==1){ //if frequency =1 then unique will add this each element
                unique+=each;
            }
        }
        System.out.println("unique = " + unique);


    }

}
