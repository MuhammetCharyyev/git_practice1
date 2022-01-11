package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LargestNumber_Nth {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,7,7,88,8,5,4, 90));

        int n=3; // need to find third place of max numbers

        for (int i = 1; i < n; i++) { // check every element starting from 1
                                     // if it is max but not exceed time than assigned to the "n"
            list.removeIf(p-> Collections.max(list)==p); //remove the first 2 max number
                                                        // as loop checking not greater than
                                                        //  "n" times, 2 times in this case
        }
                
        int max = Collections.max(list); //find the first max number

        System.out.println("max = " + max);
        
        

    }

}
