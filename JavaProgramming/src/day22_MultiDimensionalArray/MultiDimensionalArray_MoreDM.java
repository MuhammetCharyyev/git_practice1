package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray_MoreDM {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6, 7};
        int[] arr3 = {8, 9, 10, 11, 12};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}}; // include 3 arrays as above

        // 3 dimensional array contain 2 dimensional arrays, 3 type of index numbers

        //index num of each array: 0        1          2                 0             1              2
        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}}, {{10, 20, 30}, {40, 50, 60, 70}, {80, 90, 100, 110, 120}}};
        //  index num of 2d array:         0                                          1
        // each element inside the single array has also index number
        // [ index num of 2dArray][index num of 1DArray][index num of each element]

        System.out.println(Arrays.deepToString(arr3D));

        // if I want ony second of 2DArray// [[10, 20, 30], [40, 50, 60, 70], [80, 90, 100, 110, 120]]
        System.out.println(Arrays.deepToString(arr3D[1]));

        // if I want only 2 index of second of 2DArray// [40, 50, 60, 70],
        System.out.println(Arrays.toString(arr3D[1][1]));

        // to print a specific element // 40
        System.out.println(arr3D[1][1][0]);

        System.out.println("_______________________________________________");

        // simplier way to find specific element

        for (int[][] each2D : arr3D) {
            for (int[] each1D : each2D) {
                for (int eachElement : each1D) {
                    System.out.println(eachElement);
                }
            }
        }

        System.out.println("_______________________________________________");

        int[][][][] arr4D =
                {{{{1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11, 12}}, {{10, 20, 30}, {40, 50, 60, 70}, {80, 90, 100, 110, 120}}}};
        // index of 3DArray:                           0

        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int eachElement : each1D) {
                        System.out.println(eachElement);
                    }
                }
            }
        }

    }

}
