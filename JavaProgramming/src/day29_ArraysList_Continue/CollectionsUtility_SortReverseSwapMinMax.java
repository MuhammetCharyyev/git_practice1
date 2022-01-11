package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility_SortReverseSwapMinMax {

    public static void main(String[] args) {

        //CollectionsUtility works only for ArrayList but not for Array

        ArrayList<Integer> list = new ArrayList<>();
       list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9));
        // what if I want them in ascending order
        Collections.sort(list); // dedicated method to get ascending order

        System.out.println("list = " + list);
       // list = [1, 1, 2, 2, 3, 3, 4, 5, 6, 7, 8, 9]

        System.out.println("______________________________________________");
        
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'B', 'C', 'D', 'E'));
        //what if I want to reverse this list
        
        Collections.reverse(list2); // dedicated method to get reverse order

        System.out.println("list2 = " + list2);

        System.out.println("______________________________________________");

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        // what if I want to swap two elements
        
        Collections.swap(list3, 4,1); // indicate name of array and two index numbers
                                          // that you want to be swaped

        System.out.println("list3 = " + list3);
        //list3 = [10, 50, 30, 40, 20, 60, 70]

        System.out.println("______________________________________________");

        int max = Collections.max(list3); // dedicated to find max, need to assign to int
        int min = Collections.min(list3); // dedicated to find min, need to assign to int

        System.out.println("min = " + min); //min = 10
        System.out.println("max = " + max); //max = 70


        
    }

}
