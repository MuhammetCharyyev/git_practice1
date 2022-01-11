package day26_CustomMethod_Practices;

import java.util.Arrays;

public class RemoveElements_OneOption {

    public static void main(String[] args) {

        int[] nums = {100,200,300,400,500,600};
        nums= removeElement(nums, 1); // 100, 300,400...// remove index 1 from array

        System.out.println(Arrays.toString(nums));

    }


    //remove int index from array ==> one solution
    public static int[] removeElement(int[] array, int index) {
        if(index<0||index>array.length-1){
            System.err.println("invalid Index: " + index);
            System.exit(0);
        }

        int[] result = new int[array.length - 1]; // contain of elements exluding the given element

        int j = 0; // index number of the array "result"
        for (int i=0; i<array.length; i++) {
            if (i == index) { // if the element is matching with the element at given index then => skip
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove double index from array ==> one solution
    public static double[] removeElement(double[] array, double index) {
        if(index<0||index>array.length-1){
            System.err.println("invalid Index: " + index);
            System.exit(0);
        }

        double[] result = new double[array.length - 1]; // contain of elements exluding the given element

        int j = 0; // index number of the array "result"
        for (int i=0; i<array.length; i++) {
            if (i == index) { // if the element is matching with the element at given index then => skip
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove char index from array ==> one solution
    public static char[] removeElement(char[] array, char index) {
        if(index<0||index>array.length-1){
            System.err.println("invalid Index: " + index);
            System.exit(0);
        }

        char[] result = new char[array.length - 1]; // contain of elements exluding the given element

        int j = 0; // index number of the array "result"
        for (int i=0; i<array.length; i++) {
            if (i == index) { // if the element is matching with the element at given index then => skip
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }

    //remove String index from array ==> one solution
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


}
/*
Create a class named RemoveElements:
			2.1 Create a method that passes two parametetrs: an integer array and an integer index.
			the method removes the element at the given index of the array and returns the new array
					Ex:
						int[] arr = {10,20,30,40}
						remove(arr, 2) ==> {10, 20, 40}

			2.2 Create a method that passes two parametetrs: a double array and an integer index.
			 the method removes the element at the given index of the array and returns the new array


			2.3 Create a method that passes two parametetrs: a char array and an integer index.
			the method removes the element at the given index of the array and returns the new array

			2.4 Create a method that passes two parametetrs: a String array and an integer index.
			the method removes the element at the given index of the array and returns the new array





 */
