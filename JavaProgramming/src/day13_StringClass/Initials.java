package day13_StringClass;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter first name");
        String firstName = scan.next();

        System.out.println("enter last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initials = f+"."+l+".";

        System.out.println("initials = " + initials);

        scan.close();

    }
}
