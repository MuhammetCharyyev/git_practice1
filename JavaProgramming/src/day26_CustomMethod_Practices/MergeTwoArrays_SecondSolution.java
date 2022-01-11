package day26_CustomMethod_Practices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays_SecondSolution {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5,6};
        int[]arr2 = {7,4,8,9};

        int[] arr3 = merge(arr1,arr2);

        System.out.println(Arrays.toString(arr3));


    }

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = {};

        for (int each : arr1) { // check every element from the beginning
            result=ArraysUtility.addElement(result,each);
        }

        for (int each : arr2) { // check every element from the beginning
            result=ArraysUtility.addElement(result,each);
        }

        return result;
    }

    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};

        for (double each : arr1) { // check every element from the beginning
            result=ArraysUtility.addElement(result,each);
        }

        for (double each : arr2) { // check every element from the beginning
            result=ArraysUtility.addElement(result,each);
        }

        return result;
    }

    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = {};

        for (char each : arr1) { // check every element from the beginning
            result=ArraysUtility.addElement(result,each);
        }

        for (char each : arr2) { // check every element from the beginning
            result=ArraysUtility.addElement(result,each);
        }

        return result;
    }

    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};

        for (String each : arr1) { // check every element from the beginning
            result=ArraysUtility.addElement(result,each);
        }

        for (String each : arr2) { // check every element from the beginning
            result=ArraysUtility.addElement(result,each);
        }

        return result;
    }

}
