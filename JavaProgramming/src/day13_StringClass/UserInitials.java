package day13_StringClass;

import java.util.Scanner;

public class UserInitials {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("enter first name");
        String firstName = scan.next();

        System.out.println("enter last name");
        String lastName = scan.next();

        char f = firstName.charAt(0);
        char l = lastName.charAt(0);

        String initials = f+"."+l+".";
        initials =initials.toUpperCase();

        System.out.println("initials = " + initials);
        scan.close();

    }

}
/*
write a program that can return the initials of the user

            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */