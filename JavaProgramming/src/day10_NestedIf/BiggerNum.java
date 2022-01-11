package day10_NestedIf;

public class BiggerNum {

    public static void main(String[] args) {

        /*
        Create a class called BiggerNum, write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output:

         NOTE: MUST USE TERNARY
         */
        int num1 = 1, num2 =1, num3=1;

        String result = (num1 >num2 && num1 >num3)? "n1 is bigger" :(num2 >num1 && num2 >num3)? "n2 is bigger" :(num3 >num1 && num3 >num2)?
                "n3 is bigger" : "equal";

        System.out.println(result);

    }
}
