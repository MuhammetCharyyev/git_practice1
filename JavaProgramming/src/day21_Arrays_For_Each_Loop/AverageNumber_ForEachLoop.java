package day21_Arrays_For_Each_Loop;

public class AverageNumber_ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};

        double sum = 0;

        for (int number : numbers) {
            sum+=number;
        }

        double average  = sum/numbers.length;

        System.out.println(average);

    }

}
