package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloading_Intro {

    public static void main(String[] args) {

        int[] intArray = {5, 6, 3, -1, 7, 9};
        Arrays.sort(intArray);

        double[] doubleArray = {10.5, 5.6, 7.5, 8.3};
        Arrays.sort(doubleArray);

        char[] charArray = {'e', 'f', 'g', 'r', 'z'};
        Arrays.sort(charArray);

        System.out.println("_______________________________________");

        int sum1 = sumOfNums(10, 20, 30, 40);

        double sum2 = sumOfNums(10.5, 5.6, 7.5);

        System.out.println(sum1);
        System.out.println(sum2);

    }

    public static int sumOfNums(int num1, int num2) {

        return num1 + num2;
    }

    public static double sumOfNums(double num1, double num2) {

        return num1 + num2;
    }

    public static int sumOfNums(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }

    public static double sumOfNums(double num1, double num2, double num3) {

        return num1 + num2+num3;
    }

    public static int sumOfNums(int num1, int num2, int num3, int num4) {

        return num1 + num2 + num3 + num4;
    }

    public static double sumOfNums(double num1, double num2, double num3, double num4) {

        return sumOfNums(num1,num2,num3) + num4;
    }


        /*

        1. create a method that can find the sum of two numbers
                        method name: sumOf2Numbers

        2. create a method that can find the sum of three numbers
                        method name: sumOf3Numbers

        3. create a method that can find the sum of four numbers
                        method name: sumOf4Numbers
         */


}
