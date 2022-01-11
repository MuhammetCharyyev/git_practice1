package day24_CustomMethod_Return;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AddElementToArray_Task {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        int num = 4;
        //addElement(arr, num) ==> {1,2,3,4}
        System.out.println(Arrays.toString(addElement(arr, num)));

        /* or you may:
        int[] arr = {1, 2, 3};
        arr = addElement(arr, num 5);
        sout(Arrays.toString(addElement(arr);

         */

        System.out.println("____________________________________");

        double[] array = {1.5, 2.5, 3.5, 4.5};
        array = addDouble(array, 5.5); // {1.5, 2.5, 3.5, 4.5, 5.5}
        System.out.println(Arrays.toString(array));

        System.out.println("____________________________________");

        String[] names = {"Tatyana", "Alex", "Sam", "Pam"};
       names= addString(names, "Neira");
        System.out.println(Arrays.toString(names));

        System.out.println("____________________________________");

        char[] chars = {'A', 'B', 'C', 'D'};

        chars = addChar( chars, 'E');
        System.out.println(Arrays.toString(chars));



    }

    public static int[] addElement(int[] arr, int num) {
        int[] arrNum = new int[arr.length + 1];

        for (int i = 0; i < arr.length; i++) {
            // or for each loop // for (int each: arr), arrNum[i++]=each
            // then: arrNum[i] =num, but you need to create new variable for index: int i =0

            arrNum[i] = arr[i];
        }
//add the new integer to the last index
        arrNum[arrNum.length - 1] += num;

        return arrNum;
    }

    public static double[] addDouble(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }

    public static String[] addString (String[] names, String element){
        String[] result = new String[names.length + 1];

        int i =0;
        for (String each : names) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }

    public static char[] addChar (char[] chars, char element){
        char[] result = new char[chars.length + 1];

        int i =0;
        for (char each : chars) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }


}






/*
create a method named addElement that takes one integer array and one integer, the method can add the Integer number after the  last index of the integer array and returns the new array

    			Ex:
    				arr ={1,2,3};
    				num = 4;

    				addElement(arr, num) ==> {1,2,3,4}

 */
