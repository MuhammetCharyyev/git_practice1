package day26_CustomMethod_Practices;

import java.util.Arrays;

public class ReverseArray_CreateMethod {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};

        int[] result = reverse(arr1);

        System.out.println(Arrays.toString(result));

    }

    // reverse the int array method
    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { // j: represents the result index
            //or we can create int j=0 outside the loop, then => result[j++]
            result[j] = array[i];
        }
        return result;

    }

}
