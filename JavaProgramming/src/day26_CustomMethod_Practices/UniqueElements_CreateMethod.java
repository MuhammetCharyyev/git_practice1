package day26_CustomMethod_Practices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements_CreateMethod {

    public static void main(String[] args) {

        int[] arr = {1,1,2,4,4,5,8,54,7};

        int[] unique = uniqueElements(arr);
        System.out.println(Arrays.toString(unique));

    }

    // find unique int element in array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};

        for (int each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){
                // called ready method "frequencyOfElement" from ArraysUtility pack
                result = ArraysUtility.addElement(result,each);
                // called ready method "addElement" from ArraysUtility pack
            }
        }
        return result;

    }

    // find unique double element in array
    public static double[] uniqueElements(double[] array) {

        double[] result = {};

        for (double each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){
                // called ready method "frequencyOfElement" from ArraysUtility pack
                result = ArraysUtility.addElement(result,each);
                // called ready method "addElement" from ArraysUtility pack
            }
        }
        return result;

    }

    // find unique char element in array
    public static char[] uniqueElements(char[] array) {

        char[] result = {};

        for (char each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){
                // called ready method "frequencyOfElement" from ArraysUtility pack
                result = ArraysUtility.addElement(result,each);
                // called ready method "addElement" from ArraysUtility pack
            }
        }
        return result;

    }

    // find unique String element in array
    public static String[] uniqueElements(String[] array) {

        String[] result = {};

        for (String each : array) {
            if(ArraysUtility.frequencyOfElement(array, each) == 1){
                // called ready method "frequencyOfElement" from ArraysUtility pack
                result = ArraysUtility.addElement(result,each);
                // called ready method "addElement" from ArraysUtility pack
            }
        }
        return result;

    }



}
