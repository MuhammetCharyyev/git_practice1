package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElement_TwoOptionsFrequency {

    public static void main(String[] args) {
// what if I want to find unique element
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 1, 9, 7));

        ArrayList<Integer> unique = new ArrayList<>(); //need to create new ArrList

        for (Integer each : list) { //check each element
            int frequency = Collections.frequency(list, each);//check frequency
            if (frequency == 1) { //if frequency =1 then unique will add this each element
                unique.add(each);
            }
        }
        System.out.println("unique = " + unique);

        System.out.println("______________________________________________");

//second option to find unique element
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1, 10, 2, 3, 4, 5, 6, 7, 1, 2, 3, 8, 9, 1, 9, 7));

        ArrayList<Integer> unique2 = new ArrayList<>(list2);//now it contains all elements
                                                            // of list2
        unique2.removeIf(p -> Collections.frequency(list2, p) > 1); //check each element(p)
        // if it has frequency >1 then remove from the ArrList

        System.out.println("unique2 = " + unique2);

    }
}


