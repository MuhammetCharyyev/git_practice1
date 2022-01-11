package day12_Scanner;

//import java.util.*; // * - wild import? import everything from the package, but use more memory

import java.util.Scanner; // regular import, imports one class - Scanner

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter number between 1 to 7");

       int num = scan.nextInt();

       String result = "";

       if (num >=1 && num <=7) {
           result = (num==1)? "Mon" :(num==2)? "Tue" :(num==3)? "Wen" :(num==4)? "Thu" :(num==5)? "Fri"
                   :(num==6)? "Sat" : "Sun";

       }else{
           result = "invalid";
       }

        System.out.println(result);

       scan.close(); // close the Scan operation


    }
}
