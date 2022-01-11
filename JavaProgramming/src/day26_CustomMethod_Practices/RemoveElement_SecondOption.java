package day26_CustomMethod_Practices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveElement_SecondOption {

    public static void main(String[] args) {

        int[] nums = {100,200,300,400,500,600};
        nums= removeElement(nums, 1); // 100, 300,400...// remove index 1 from array

        System.out.println(Arrays.toString(nums));

    }



    public static int[] removeElement(int[] array, int index) {
        if(index<0||index>array.length-1){
            System.err.println("invalid Index: " + index);
            System.exit(0);
        }
        int[] result = {}; // contain of elements exluding the given element

        for (int i=0; i<array.length; i++) {
            if (i != index) { // if the element is matching with the element at given index then => skip
                ArraysUtility.addElement(result,array[i]); // method is taken from ArraysUtility pack
            }
        }
        return result;
    }

}
