package day26_CustomMethod_Practices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray_CreatMethod_2ndOption {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6,7};

        int[] result = reverse(arr1);

        System.out.println(Arrays.toString(result));

    }


    public static int[] reverse( int[] array){

        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]); // another way to reverse to call from ArraysUtility
                                                                 // addElement
        }
        return result;

    }

}
