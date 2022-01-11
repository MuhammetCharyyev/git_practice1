package day09_IfStatements2;

public class MinNumber {

    public static void main(String[] args) {

        int n1 = 100, n2 = 100;

        boolean n1IsMin = n1<n2;
        boolean n2IsMin = n2<n1;
        boolean equal = n1==n2;

        if (n1IsMin){
            System.out.println(n1 +" is a min num");
        }
        if (n2IsMin){
            System.out.println(n2 +" is a min num");
        }

        if (equal){
            System.out.println(n2 +" and " + n1+" are equal");
        }





    }
}

/*
Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */