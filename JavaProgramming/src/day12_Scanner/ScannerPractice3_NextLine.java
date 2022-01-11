package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter name");

        String name = scan.nextLine(); //nextLine allow to enter data with spaces till you press Enter
        System.out.println("name = " + name);

        System.out.println("enter age");
        int age = scan.nextInt();

        scan.nextLine(); //allow to press Enter and proceed with data entering

        System.out.println("enter school name");
        String school = scan.nextLine();

        scan.close();



    }
}
