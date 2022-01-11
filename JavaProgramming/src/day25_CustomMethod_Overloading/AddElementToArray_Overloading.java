package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArray_Overloading {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7}; // add 8
       arr= addElement(arr, 8);

        char [] chars = {'A', 'B', 'C', 'D'}; // 'E'

        chars = addElement(chars, 'E');

        String[] names = {"Tatyana", "Alex", "Sam", "Pam"}; // add "Dory"

        names = addElement(names, "Dory");

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(chars));

    }


    //1. create a return method called addInteger that can add an Integer
    // after the  last index of an integer array

    public static int[] addElement(int[] arr, int num) {
        int[] arrNum = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) { // or for each loop // for (int each: arr), arrNum[i++]=each
            // then: arrNum[i] =num, but you need to create new variable for index: int i =0

            arrNum[i] = arr[i];
        }
//add the new integer to the last index
        arrNum[arrNum.length - 1] += num;

        return arrNum;
    } // diff parameters but one name to all

    //2. create a return method called addDouble that can add
    // a double after the last index of a double array

    public static double[] addElement (double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }

    // 3. create a return method called addString that can
    // add a String after the last index of a String array

    public static String[] addElement (String[] names, String element){
        String[] result = new String[names.length + 1];

        int i =0;
        for (String each : names) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }

   // 4. create a return method called addChar that can add a char after last index of a char array

    public static char[] addElement (char[] chars, char element){
        char[] result = new char[chars.length + 1];

        int i =0;
        for (char each : chars) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }

}

