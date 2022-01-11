package day21_Arrays_For_Each_Loop;

public class Maximum_Number_ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 5, 4, 20, 1, 0};

        int min = numbers[0];
        int max = numbers[0];

       /*for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < min) {
                min = numbers[i];
    }

        */

        for (int each : numbers) { // shortcut for this: numbers.for
            if (each < max) {
                max = each;
            }
            if (each > min) {
                min = each;
            }
        }

        System.out.println(min);
        System.out.println(max);
    }


}
