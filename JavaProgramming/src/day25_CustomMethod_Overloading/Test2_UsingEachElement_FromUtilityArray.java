package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Test2_UsingEachElement_FromUtilityArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7}; // called method from ArraysUtility // print each element

        ArraysUtility.printEachElement(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("____________________________________");

        double[] arr2 = {2.3, 5.6, 3.1, 6.7};// called method from ArraysUtility // print each element
        ArraysUtility.printEachElement(arr2);
        System.out.println(Arrays.toString(arr2));

        System.out.println("____________________________________");

        char[] arr3 = {'a', 'b', 'c', 'd', 'e'};// called method from ArraysUtility // print each element
        ArraysUtility.printEachElement(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("____________________________________");

        String[] arr4 = {"Tatyana", "Alex", "Sam", "Pam"};// called method from ArraysUtility // print each element
        ArraysUtility.printEachElement(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("____________________________________");

        int[] n1 = {1, 2, 3, 4, 5, 6, 7}; // called method from ArraysUtility // find max int

        int max1 = ArraysUtility.max(n1);
        System.out.println(max1);

        System.out.println("____________________________________");

        double[] n2 = {2.3, 5.6, 3.1, 6.7}; // called method from ArraysUtility // find max double

        double max2 = ArraysUtility.max(n2);
        System.out.println(max2);

        System.out.println("____________________________________");

        int[] num = {1, 2, 3, 4, 5, 6, 7}; // called method from ArraysUtility // find if array contains element

        boolean b1 = ArraysUtility.isContained(num, 5);

        System.out.println(b1); // will give true

        System.out.println("____________________________________");




    }

}
