package day20_Arrays;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};

        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) { // numbers.fori ==> shortcut
            // for (int i1 = numbers.length - 1; i1 >= 0; i1--) { // numbers.forr ==> shortcut

            if (numbers[i] > max) { // if there is element in the array that's greater than current max number
                max = numbers[i]; // assigning greater number to variable max // will check index by index to
                // find the greater number till numbers[i] is less than max
            }
        }


            System.out.println(max);






    }

}
