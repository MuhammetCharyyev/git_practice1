package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70};

        // we need to get reverse array

        int[] reverse = new int[numbers.length]; // make sure that array has enough capacity to include
        // all elements of first array



      /*
        reverse[0] = numbers[numbers.length - 1];
        reverse[1] = numbers[2];
        reverse[2] = numbers[1];
        reverse[3]=numbers[0];

       */
        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) { // forr loop helps for reverse
            reverse[j] = numbers[i];

        }
        System.out.println(Arrays.toString(reverse));

    }

}
