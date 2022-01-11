package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList_WthtReverseMethod {

    public static void main(String[] args) {
        // to reverse simple array:
        int[] array = {1,2,3,4,5,6,7,8,9,10}; //want to get them in reverse

        int[] result= new int[array.length]; //create new array to be sure that it
                                             // has enough capacity to add old data

        int j =0; // create for elements of result and to assign reversed array starting
                  //from index 0 of result till the end
        for (int i = array.length - 1; i >= 0; i--, j++) {//reverse iteration
            result[j]=array[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("______________________________________________");
        // now to find reverse for ArrList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        ArrayList<Integer> reverse = new ArrayList<>();//create new ArrList
                                                  // to add new reverse data

        for (int i = array.length - 1; i >= 0; i--){
            int each = list.get(i); //int is adding each element of ArrList in reverse order
            reverse.add(each); //new ArrList "reverse" will add each element
        }

        System.out.println("reverse = " + reverse);


    }
}
