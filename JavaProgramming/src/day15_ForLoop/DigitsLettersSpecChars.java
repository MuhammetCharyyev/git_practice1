package day15_ForLoop;
import java.util.Scanner;

public class DigitsLettersSpecChars {

    public static void main(String[] args) {

        System.out.println("Enter any characters:");
        String s = new Scanner(System.in).next(); // short option for one input only, does not need to close

        String letters = "", digits = "", specials = "";
        char character;

        for (int i = 0; i < s.length(); i++) { // i: index numbers os string (0~last index)
            character = s.charAt(i); // each character that we have in string
            if ((character >= 'a' && character <= 'z' ) || (character >= 'A' && character <= 'Z')){
                letters += character;
            }else if (character >= '0' && character <= '9'){
                digits += character;
            }else{
                if (character!=' '){ // if the special character is not a space
                    specials += character;
                }
            }

        }
        System.out.println("letters: " + letters);
        System.out.println("digits: " + digits);
        System.out.println("special chars: " + specials);


    }
}
/*
5. write a program that can retrive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!

                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */

