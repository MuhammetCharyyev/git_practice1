package day28_ArrayList;

import utilities.ArraysUtility;

import java.time.temporal.ChronoField;
import java.util.Arrays;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" "); // must be more than 8 symbols
                                                                        // and with no space
        boolean r2 = false; // check if it has upper case
        boolean r3 = false; // check if it has lower case
        boolean r4 = false; // check if it has special char
        boolean r5 = false; // check if it has digit

        char[] chars = password.toCharArray(); // convert to array and will check every char

        for (char each : chars) { // each character of the array
            if(Character.isUpperCase(each)){ // check if each char has upper case
                r2=true; // if contains then true
            }else if (Character.isLowerCase(each)){ // check if each char has lower case
                r3=true; // if contains then true
            }else if (Character.isDigit(each)){  // check if each char has digit
                r5 =true; // if contains then true
            }else{ // check if each char has special char
                r4 =true; // if contains then true
            }
            if(r1 && r2 && r3 && r4 && r5){ // optional, not necessary
                break; // if password contains all the required symbols then the loop will not be proceed
            }

        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println(isStrongPassword);
    }

    public static boolean isStrongPassword (String password){ // creat a method to check strong password

        boolean r1 = password.length() >= 8 && !password.contains(" "); // must be more than 8 symbols
        // and with no space
        boolean r2 = false; // check if it has upper case
        boolean r3 = false; // check if it has lower case
        boolean r4 = false; // check if it has special char
        boolean r5 = false; // check if it has digit

        char[] chars = password.toCharArray(); // convert to array and will check every char

        for (char each : chars) { // each character of the array
            if(Character.isUpperCase(each)){ // check if each char has upper case
                r2=true; // if contains then true
            }else if (Character.isLowerCase(each)){ // check if each char has lower case
                r3=true; // if contains then true
            }else if (Character.isDigit(each)){  // check if each char has digit
                r5 =true; // if contains then true
            }else{ // check if each char has special char
                r4 =true; // if contains then true
            }

        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;
    }

}
/*
1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit
 */