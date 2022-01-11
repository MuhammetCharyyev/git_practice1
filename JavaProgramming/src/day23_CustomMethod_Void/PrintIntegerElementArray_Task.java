package day23_CustomMethod_Void;

import java.util.Arrays;

public class PrintIntegerElementArray_Task {

    public static void main(String[] args) {

printEachElement (new int[] {12,234,45,435});

    }

    public static void printEachElement (int[] number) {

        for (int each : number) {

            System.out.println(each);
        }

    }


}
// create a method named printEachElement that can print each elements of an integer array