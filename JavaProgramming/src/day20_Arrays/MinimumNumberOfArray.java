package day20_Arrays;

public class MinimumNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

        if (numbers[i] < min) { // if there is element in the array that's less than current min number
            min = numbers[i]; // assigning smaller number to variable min // will check index by index to
            // find the smaller number till numbers[i] is more than min
        }
    }


            System.out.println(min);

    }


}
