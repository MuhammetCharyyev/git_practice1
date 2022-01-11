package day22_MultiDimensionalArray;

import java.util.Arrays;

public class Iterating_ForEachLoop {

    public static void main(String[] args) {

        // index of elements 0 1 2... 0 1 2 3....0 1  2 3  4
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} }; // inside the single DM the element has index num
        //indexes of array:    0         1            2

        for (int[] each1dArray : arr2D) { // represent each dimensional array
            //System.out.println(Arrays.toString(each1dArray));
            for (int eachElement : each1dArray) { // each element
                System.out.println(eachElement);
            }
        }


    }
}
