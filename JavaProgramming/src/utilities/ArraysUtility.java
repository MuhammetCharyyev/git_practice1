package utilities;

import java.util.Arrays;

public class ArraysUtility {

    //create method to print each integer of int array in separate line// to call this in other class
    public static void printEachElement(int[] array) {

        for (int each : array) {
            System.out.println(each);
        }
    }

    //create method to print each double of double array in separate line// to call this in other class
    public static void printEachElement(double[] array) {

        for (double each : array) {
            System.out.println(each);
        }
    }

    //create method to print each char of char array in separate line// to call this in other class
    public static void printEachElement(char[] array) {

        for (char each : array) {
            System.out.println(each);
        }
    }

    //create method to print each string of string array in separate line// to call this in other class
    public static void printEachElement(String[] array) {

        for (String each : array) {
            System.out.println(each);
        }
    }

    //_________________________________________________________________________________________________________

    // create method to find a max number from int array // to call this in other class
    public static int max(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // create method to find a max number from int array // to call this in other class
    public static double max(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }

    // create method to find a min number from int array // to call this in other class
    public static int min(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    // create method to find a max number from int array // to call this in other class
    public static double min(double[] numbers) {
        Arrays.sort(numbers);
        return numbers[0];
    }

    //_________________________________________________________________________________________________________

    // create method if the given integer is contained in the given array, returns boolean
    public static boolean isContained(int[] array, int element) {

        boolean result = false;

        for (int each : array) {
            if (each == element) { // if any array element is matching to the given element it will be return to true
                result = true;
            }
        }
        return result;
    }

    // create method if the given double is contained in the given array, returns boolean
    public static boolean isContained(double[] array, double element) {

        boolean result = false;

        for (double each : array) {
            if (each == element) {
                result = true;
            }

        }
        return result;
    }

    // create method if the given char is contained in the given array, returns boolean
    public static boolean isContained(char[] array, char element) {

        boolean result = false;

        for (char each : array) {
            if (each == element) {
                result = true;
            }
        }
        return result;
    }

    // create method if the given String is contained in the given array, returns boolean
    public static boolean isContained(String[] array, String element) {

        boolean result = false;

        for (String each : array) {
            if (each.equals(element)) {
                result = true;
            }
        }
        return result;
    }

    //_________________________________________________________________________________________________________

    // merge two integers arrays and return to one array
    public static int[] merge(int[] arr1, int[] arr2) {

        int[] result = {};

        for (int each : arr1) { // check every element from the beginning
            result = ArraysUtility.addElement(result, each);
        }

        for (int each : arr2) { // check every element from the beginning
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    //merge two doubles arrays and return to one array
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] result = {};

        for (double each : arr1) { // check every element from the beginning
            result = ArraysUtility.addElement(result, each);
        }

        for (double each : arr2) { // check every element from the beginning
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    //merge two chars arrays and return to one array
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] result = {};

        for (char each : arr1) { // check every element from the beginning
            result = ArraysUtility.addElement(result, each);
        }

        for (char each : arr2) { // check every element from the beginning
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    //merge two Strings arrays and return to one array
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] result = {};

        for (String each : arr1) { // check every element from the beginning
            result = ArraysUtility.addElement(result, each);
        }

        for (String each : arr2) { // check every element from the beginning
            result = ArraysUtility.addElement(result, each);
        }

        return result;
    }

    //_________________________________________________________________________________________________________

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
    public static double[] addElement(double[] array, double element) {
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
    public static String[] addElement(String[] names, String element) {
        String[] result = new String[names.length + 1];

        int i = 0;
        for (String each : names) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }

    // 4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] chars, char element) {
        char[] result = new char[chars.length + 1];

        int i = 0;
        for (char each : chars) {
            result[i++] = each;
        }

        result[i] = element;

        return result;

    }

    //_________________________________________________________________________________________________________

    // frequency of the given int element from given array// {1,1,2,4,4,5,8,54,7}  find frequency of 4 (for examp)
    public static int frequencyOfElement(int[] array, int element) {

        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;

    }

    // frequency of the given double element from given array
    public static double frequencyOfElement(double[] array, double element) {

        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

    // frequency of the given char element from given array
    public static int frequencyOfElement(char[] array, char element) {
        int count = 0;
        for (char each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;
    }

    //returns the frequency of the given string from the given array
    public static int frequencyOfElement(String[] array, String element) {
        int count = 0;
        for (String each : array) {
            if (each.equals(element)) {
                count++;
            }
        }

        return count;
    }

    //_________________________________________________________________________________________________________

    // find unique int element in array
    public static int[] uniqueElements(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                // called ready method "frequencyOfElement" from ArraysUtility pack
                result = ArraysUtility.addElement(result, each);
                // called ready method "addElement" from ArraysUtility pack
            }
        }
        return result;

    }

    // find unique double element in array
    public static double[] uniqueElements(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                // called ready method "frequencyOfElement" from ArraysUtility pack
                result = ArraysUtility.addElement(result, each);
                // called ready method "addElement" from ArraysUtility pack
            }
        }
        return result;

    }

    // find unique char element in array
    public static char[] uniqueElements(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                // called ready method "frequencyOfElement" from ArraysUtility pack
                result = ArraysUtility.addElement(result, each);
                // called ready method "addElement" from ArraysUtility pack
            }
        }
        return result;

    }

    // find unique String element in array
    public static String[] uniqueElements(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array, each) == 1) {
                // called ready method "frequencyOfElement" from ArraysUtility pack
                result = ArraysUtility.addElement(result, each);
                // called ready method "addElement" from ArraysUtility pack
            }
        }
        return result;

    }

    //_________________________________________________________________________________________________________

    //remove int index from array ==> one solution
    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1]; // contain of elements exluding the given element

        int j = 0; // index number of the array "result"
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the element is matching with the element at given index then => skip
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove double index from array ==> one solution
    public static double[] removeElement(double[] array, double index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1]; // contain of elements exluding the given element

        int j = 0; // index number of the array "result"
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the element is matching with the element at given index then => skip
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove char index from array ==> one solution
    public static char[] removeElement(char[] array, char index) {
        if (index < 0 || index > array.length - 1) {
            System.err.println("invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1]; // contain of elements exluding the given element

        int j = 0; // index number of the array "result"
        for (int i = 0; i < array.length; i++) {
            if (i == index) { // if the element is matching with the element at given index then => skip
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove String index from array ==> one solution
    public static String[] removeElement(String[] array, int index) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid Index: " + index);
            System.exit(0);
        }

        String[] result = new String[array.length - 1]; //1,2

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }

    //_________________________________________________________________________________________________________

    // reverse the int array method
    public static int[] reverse(int[] array) {

        int[] result = new int[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { // j: represents the result index
            //or we can create int j=0 outside the loop, then => result[j++]
            result[j] = array[i];
        }
        return result;

    }

    // reverse the double array method
    public static double[] reverse(double[] array) {

        double[] result = new double[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { // j: represents the result index
            //or we can create int j=0 outside the loop, then => result[j++]
            result[j] = array[i];
        }
        return result;

    }

    // reverse the char array method
    public static char[] reverse(char[] array) {

        char[] result = new char[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { // j: represents the result index
            //or we can create int j=0 outside the loop, then => result[j++]
            result[j] = array[i];
        }
        return result;

    }

    // reverse the String array method
    public static String[] reverse(String[] array) {

        String[] result = new String[array.length];


        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) { // j: represents the result index
            //or we can create int j=0 outside the loop, then => result[j++]
            result[j] = array[i];
        }
        return result;

    }

    //_________________________________________________________________________________________________________

    // replace one int element from array by another
    public static int[] replaceElement(int[] array, int index, int newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }

    // replace one double element from array by another
    public static double[] replaceElement(double[] array, int index, double newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    // replace one char element from array by another
    public static char[] replaceElement(char[] array, int index, char newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

    // replace one String element from array by another
    public static String[] replaceElement(String[] array, int index, String newElement) {

        if (index < 0 || index > array.length - 1) {
            System.err.println("Invalid index: " + index);
            System.exit(0);
        }
        array[index] = newElement;
        return array;

    }

//_________________________________________________________________________________________________________

    // replace all int elements from array by new elements
    public static int[] replaceAllElements(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // replace all double elements from array by new elements
    public static double[] replaceAllElements(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // replace all char elements from array by new elements
    public static char[] replaceAllElements(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }
        return array;
    }

    // replace all String elements from array by new elements
    public static String[] replaceAllElements(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(oldValue)) {
                array[i] = newValue;
            }
        }
        return array;
    }

    //_________________________________________________________________________________________________________

    //remove all int duplicates from array
    public static int[] removeDuplicates(int[] array) {

        int[] result = {};

        for (int each : array) {
            if (!ArraysUtility.isContained(result, each)) { //called from ArraysUtility class
                result = ArraysUtility.addElement(result, each); //called from ArraysUtility class
            }

        }
        return result;

    }

    //remove all double duplicates from array
    public static double[] removeDuplicates(double[] array) {

        double[] result = {};

        for (double each : array) {
            if (!ArraysUtility.isContained(result, each)) { //called from ArraysUtility class
                result = ArraysUtility.addElement(result, each); //called from ArraysUtility class
            }

        }
        return result;

    }

    //remove all char duplicates from array
    public static char[] removeDuplicates(char[] array) {

        char[] result = {};

        for (char each : array) {
            if (!ArraysUtility.isContained(result, each)) { //called from ArraysUtility class
                result = ArraysUtility.addElement(result, each); //called from ArraysUtility class
            }

        }
        return result;

    }

    //remove all String duplicates from array
    public static String[] removeDuplicates(String[] array) {

        String[] result = {};

        for (String each : array) {
            if (!ArraysUtility.isContained(result, each)) { //called from ArraysUtility class
                result = ArraysUtility.addElement(result, each); //called from ArraysUtility class
            }

        }
        return result;

    }


}
