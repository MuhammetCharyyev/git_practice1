package day22_MultiDimensionalArray;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class MultiDimensionalArray_Intro {

    public static void main(String[] args) {
        String[] group1 = {"Jon", "Joes", "James"};
        String[] group2 = {"Aaron", "Shay", "Breanna"};
        String[] group3 = {"Cassandra", "Tahir", "Aygun"};

        String[][] groups = new String[3][]; // index: 0,1,2
        groups[0] =group1;
        groups[1] = group2;
        groups[2] = group3;



       // System.out.println(Arrays.toString(groups)); // toString() is for single dimensional arrays only

        System.out.println(Arrays.deepToString(groups)); // deepToString() is dedicated to print out
        // multidimensional arrays

        System.out.println("____________________________________________________________");

        /*
        these arrays I want to store in multi:

        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */
       // index of elements 0 1 2... 0 1 2 3....0 1  2 3  4
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} }; // inside the single DM the element has index num
        //indexes of array:    0         1            2
        // as miltyDM arrays have 2 type of indexes we do have to have two [] [], first for index of array
        // and second one for index of element

        System.out.println(Arrays.deepToString(arr2D)); // to print 2Dim array

        System.out.println(Arrays.toString(arr2D[1])); // to print the second (index 1) array

        System.out.println(arr2D[2][3]); // no need to indicate deepToString, if it returns to single element

        // to get the sing dimensional array we may use loop as well








    }

}
