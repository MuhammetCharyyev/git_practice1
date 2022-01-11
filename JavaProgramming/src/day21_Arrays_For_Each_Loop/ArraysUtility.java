package day21_Arrays_For_Each_Loop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {


        int[] nums = {1,2,3,4,5};

        System.out.println(nums); // will be a hashcode

        String str = "Java";

        System.out.println(Arrays.toString(nums));

        System.out.println("___________________________________");

        int [] scores = {95, 100,55, 65, 85};

        Arrays.sort(scores); // the smallest number will be places at the 0 index {55...100}

        System.out.println(Arrays.toString(scores));

        System.out.println("min num" + scores[0]); // from min to max
        System.out.println("max num" + scores[scores.length-1]); // from max to min


        String[] names = {"anna", "ahmet", "zuhra", "maria", "sasha"};

        Arrays.sort(names);

        System.out.println(Arrays.toString(names));

        String[] words = {"Anna", "ANNA"}; //in ASCI table the upper case has a lower number that's why it
        // be printed first due to Arrays.sort(words)

        Arrays.sort(words);

        System.out.println(Arrays.toString(words));

        System.out.println("___________________________________");

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,3,2};

        boolean r1 = Arrays.equals(arr1, arr2);  // compaire 2 arrays // false

        System.out.println(r1);

        Arrays.sort(arr1); // {123}
        Arrays.sort(arr2); // {123}

        boolean r2 = Arrays.equals(arr1, arr2);  // compair 2 arrays // now true // Arrays.equals always return to
        //boolean

        System.out.println(r2);

        System.out.println("___________________________________");

        char[] ch1 = {'a', 'c', 'b'};
        char[] ch2 = {'b', 'a', 'c'}; // task ==> do the anagram ==> 2 words contain same characters

        Arrays.sort(ch1); //{a,b,c}
        Arrays.sort(ch2); //{a,b,c}

        boolean anagram = Arrays.equals(ch1, ch2); // Arrays.equals always return to boolean

        System.out.println(anagram);




    }
}
