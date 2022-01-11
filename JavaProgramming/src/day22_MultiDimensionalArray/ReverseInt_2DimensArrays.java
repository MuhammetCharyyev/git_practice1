package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseInt_2DimensArrays {

    public static void main(String[] args) {

        int [][] twoDimens =  { {1,2,3}, {4,5,6}};


        for (int i = twoDimens.length - 1; i >= 0; i--) {
            for (int j = twoDimens[i].length-1; j >=0 ; j--) {

                System.out.println(twoDimens [i][j] +" ");
            }
        }
        
        

    }

}
/*

Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};


		output:
			reverse = { {6,5,4}, {3,2,1},};
 */