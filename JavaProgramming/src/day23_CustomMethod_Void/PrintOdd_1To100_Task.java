package day23_CustomMethod_Void;

public class PrintOdd_1To100_Task {

    public static void main(String[] args) {

        oddFm1To100();

    }

    public static void oddFm1To100 (){

        for (int i = 1; i < 100; i+=2) {

            System.out.print(i+" ");

        }

    }

}

/*
create a method that can print odd numbers between 1~100 in a same line saperated by space
 */
