package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicatesArray_Method {

    public static void main(String[] args) {

        int[] arr = {1,2,3,2,5,5,1,6,3};

        arr = removeDuplicates(arr);

        System.out.println(Arrays.toString(arr));

        System.out.println("______________________________________________________");

        String[] words ={"Java", "Java", "C#", "Python", "Java"};

        words = removeDuplicates(words);

        System.out.println(Arrays.toString(words));

        System.out.println("______________________________________________________");

        int[] numbers = {1,2,3,2,5,5,1,6,3,1,1,5,5,6,6,4,3,2};

        numbers= Arrays.stream(numbers).distinct().toArray(); // new method, will learn
        System.out.println(Arrays.toString(numbers));

    }



    //remove all int duplicates
    public static int[] removeDuplicates (int[] array){

        int[] result = {};

        for (int each : array) {
            if(!ArraysUtility.isContained(result,each)){ //called from ArraysUtility class
               result=ArraysUtility.addElement(result,each); //called from ArraysUtility class
            }

        }
        return result;

    }

    //remove all double duplicates
    public static double[] removeDuplicates (double[] array){

        double[] result = {};

        for (double each : array) {
            if(!ArraysUtility.isContained(result,each)){ //called from ArraysUtility class
                result=ArraysUtility.addElement(result,each); //called from ArraysUtility class
            }

        }
        return result;

    }

    //remove all char duplicates
    public static char[] removeDuplicates (char[] array){

        char[] result = {};

        for (char each : array) {
            if(!ArraysUtility.isContained(result,each)){ //called from ArraysUtility class
                result=ArraysUtility.addElement(result,each); //called from ArraysUtility class
            }

        }
        return result;

    }

    //remove all String duplicates
    public static String[] removeDuplicates (String[] array){

        String[] result = {};

        for (String each : array) {
            if(!ArraysUtility.isContained(result,each)){ //called from ArraysUtility class
                result=ArraysUtility.addElement(result,each); //called from ArraysUtility class
            }

        }
        return result;

    }
    
    

}
