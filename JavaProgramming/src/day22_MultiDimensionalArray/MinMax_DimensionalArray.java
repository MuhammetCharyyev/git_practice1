package day22_MultiDimensionalArray;

public class MinMax_DimensionalArray {

    public static void main(String[] args) {

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}}; // include 3 arrays

        int min = arr2D[0][0];
        int max = arr2D[0][0];

        for (int[] each1dArray : arr2D) { // represent each dimensional array
            //System.out.println(Arrays.toString(each1dArray));
            for (int eachElement : each1dArray) { // each element
                if (eachElement < max) {
                    max = eachElement;
                }
                if (eachElement > min) {
                    min = eachElement;
                }
            }
        }
        System.out.println(min);
        System.out.println(max);

    }


}
/*
 Write a program that can find the minimum and maximum numbers from a two dimensional array

 */
