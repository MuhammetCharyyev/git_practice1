package day27_WrapperClasses;

import java.util.Arrays;

public class InsertElement_Method {

    public static void main(String[] args) {

        int[]arr = {10, 20, 30, 40, 50};

        arr= insertElement(arr, 2, 100);// ==> {10, 20, 100, 30, 40, 50}

        System.out.println(Arrays.toString(arr));

    }

    public static int[] insertElement (int[] array, int index, int element){

        int[] arrNum = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) { // or for each loop // for (int each: arr), arrNum[i++]=each
            // then: arrNum[i] =num, but you need to create new variable for index: int i =0

            arrNum[i] = array[i];
        }
//add the new integer to the last index
        arrNum[index] += element;

        return arrNum;
    }


}
/*
Insert Task:
		1.1 Create a method named insert that passes three parameters: integer array, integer index,
		 integer element. the method inserts the given element to the given index of the array and
		  returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array

 */
