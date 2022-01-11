package day21_Arrays_For_Each_Loop;

public class OddEven_ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10,23,45,63,42,12,6,80};

       int odd = numbers[0];
       int even = numbers[0];



        for (int each : numbers) { // shortcut for this: numbers.for
            if (each %2==0) {
               even +=each;
            }else {
                odd +=each;
            }
        }

      System.out.println(even);
       System.out.println(odd);

    }

}
/*Write a program that can count the even and odd number from an array of integers
			Note: MUST use for each loop

 */
