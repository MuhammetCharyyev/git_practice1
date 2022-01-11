package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class DescendingOrder {

    public static void main(String[] args) {

        int[] numbers = {10, 35, 78, 23, 74, 574, 495, 1992, 74};

        Arrays.sort(numbers);

        int[] reverse = new int[numbers.length];

        for (int i = numbers.length - 1, j = 0; i >= 0; i--, j++) { // forr loop helps for reverse
            reverse[j] = numbers[i];
        }

        System.out.println(Arrays.toString(reverse));


    }

}
// Write a program that sort the array of integer in descending order
