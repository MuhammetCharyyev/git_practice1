package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray_Loop2 {

    public static void main(String[] args) {

        // index of elements 0 1 2... 0 1 2 3....0 1  2 3  4
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} }; // inside the single DM the element has index num
        //indexes of array:    0         1            2

        /*
        if we want:
        8,9,10,11,12
        4,5,6,7
        1,2,3
         */

        for(int i = arr2D.length-1; i>=0; i--) {//i: index of single dimensional array
            // will get in reverse order each array
            for (int j = 0; j < arr2D[i].length; j++) { // j: index of each elements// [i] represents index of each array

                System.out.print(arr2D[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println("_____________________________________________________");

        // to print everything in reverse order starting from first array

        for(int i = 0; i<arr2D.length; i++) {//i: index of single dimensional array
            for (int j = arr2D[i].length-1; j >=0 ; j--) { // j: index of each elements
                // [i] represents index of each array // will get in reverse order each element

                System.out.print(arr2D[i][j] +" ");
            }
            System.out.println();
        }


    }

}
