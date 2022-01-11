package day20_Arrays;


public class AverageNumbersOfArray {

    public static void main(String[] args) {


        int[] numbers = {10,20,30,40,50,60};

        double sum = 0; // to get decimal result you need to convert to double

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }

        double average = sum/numbers.length;

        System.out.println("average = " + average);


    }

}
