package day11_SwitchScanner;


import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // 'in' represent input option

        System.out.println("enter integer: ");

       int num1 = input.nextInt();

        System.out.println("enter decimal: ");

        double num2 = input.nextDouble();
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num1*num2);

        input.close(); // close the scanner as recomendation, without it the code will be slow down

        /*

        System.out.println("enter integer: ");
        int num3 = input.nextInt();
        System.out.println(num3);

        you cannot input any data after the scanner is closed
         */

    }
}
