package utilities;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class MathUtility {


   // sum of 2 integers
    public static int sumOf2Nums(int num1, int num2) {

        return num1 + num2;
    }

    // sum of 2 doubles
    public static double sumOf2Nums(double num1,double num2) {

        return num1 + num2;
    }
    //_________________________________________________________________________________________________________

    // subtraction of 2 integers
    public static int subtractionOf2Nums(int num1, int num2) {

        return num1 - num2;
    }

    // subtraction of 2 doubles
    public static double subtractionOf2Nums(double num1,double num2) {

        return num1 - num2;
    }
    //_________________________________________________________________________________________________________

    // multiplication of 2 integers
    public static int multiplicationOf2Nums(int num1, int num2) {

        return num1 * num2;
    }

    // multiplication of 2 doubles
    public static double multiplicationOf2Nums(double num1,double num2) {

        return num1 * num2;
    }
    //_________________________________________________________________________________________________________

    // division of 2 integers
    public static int divisionOf2Nums(int num1, int num2) {

        return num1 / num2;
    }

    // division of 2 doubles
    public static double divisionOf2Nums(double num1,double num2) {

        return num1 / num2;
    }
    //_________________________________________________________________________________________________________

    // check if an integer is even number
    public static boolean evenNumber (int num) {

        boolean isEven = num % 2 == 0;

        return isEven;
    }

    // check if an integer is odd number
    public static boolean oddNumber (int num) {

        boolean isOdd = num % 2 != 0;

        return isOdd;
    }
    //_________________________________________________________________________________________________________

    // create method to find a max number between two integers // to call this in other class
    public static int maxMath(int num1, int num2) {
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    // create method to find a max number between two doubles // to call this in other class
    public static double maxMath(double num1, double num2) {
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }

    // create method to find a min number between two integers // to call this in other class
    public static int minMath(int num1, int num2) {
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }
    }

    // create method to find a max number between two doubles // to call this in other class
    public static double minMath(double num1, double num2) {
        if(num1<num2){
            return num1;
        }else{
            return num2;
        }
    }

    //_________________________________________________________________________________________________________

    // create a method that can return the square of an integer
    public static int squareInteger (int number){

        return  number*number;
    }

    // create a method that can return the square of a double
    public static double squareInteger (double number){

        return  number*number;
    }

    // create a method that can return the cube of an integer
    public static int cubeInteger (int number){

        return  number*number*number;
    }

    // create a method that can return the cube of a double
    public static double cubeInteger (double number){

        return  number*number*number;
    }


}
