package day20_Arrays;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int[] number = {10, 0, 5, 0, 1, 0};

     int zeroes = 0;

        for (int i = 0; i < number.length; i++) {
            if(number[i]!=0){
                int j = number[zeroes];
                number[zeroes] = number[i];
                number[i]=j;
                zeroes++;
            }

        }

      /*
        int[] num = new int[number.length];
        int j = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] != 0) {
                num[i - j] = number[i];
            } else {
                j++;
            }
        }
        */

        System.out.println(Arrays.toString(number));

    }
}
/*
write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */