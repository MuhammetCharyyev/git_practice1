package day21_Arrays_For_Each_Loop;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class Arrays_Copy_CopyRange {

    public static void main(String[] args) {

        String [] students = {"Elif", "Sinem", "Gunay", "Cihad", "David", "James", "Aaron"}; //
        // task copy 3 names and to the another array

        String[] earlyBirds = Arrays.copyOf(students, 3); // 3 first indexes will copied and
        // added to new String// if you indicate newLength more than arrays then it will be printed [null] as default

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7,8,9}; // what if I want only first 5 of them // you may assign as below

        numbers = Arrays.copyOf(numbers, 5); // [1,2,3,4,5]

        System.out.println(Arrays.toString(numbers));

        System.out.println("__________________________________________");

        char[] ch1 = {'A', 'B', 'C', 'D', 'E', 'F'}; // what if I want copy starting from middle

        char[] ch2 = Arrays.copyOfRange( ch1, 3, 5); //or you can indicate last index +1 as a final point
        // copyOfRange help here // [D,E]
        // similar to substring method

        System.out.println(Arrays.toString(ch2));

        System.out.println("__________________________________________");

        int[] scores ={10, 20, 30,40,50,60,70,80,90,100};

        int[] result = Arrays.copyOfRange(scores, 3, 8); //[40...80];

        System.out.println(Arrays.toString(result));

        //OR

        int[] result2 = Arrays.copyOfRange(scores, 3, scores.length-2); // if array is too long or you dont
        // know the length

        System.out.println(Arrays.toString(result2));



    }

}
