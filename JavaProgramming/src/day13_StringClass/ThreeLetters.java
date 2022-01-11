package day13_StringClass;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ThreeLetters {

    public static void main(String[] args) {

        Scanner three = new Scanner(System.in);

        System.out.println("Enter your three letters word");
        String threeLetters = three.next();

        int countLetters = threeLetters.length();
        char a = 'a';
        char lastTwo = threeLetters.charAt(countLetters - 2);

        if (countLetters>3) {
            System.out.println("Word is too long");
        }else if (countLetters<3) {
            System.out.println("Word is too short");
        }else if (lastTwo ==a) {
            System.out.println("Cool word");
        }else if (lastTwo !=a) {
            System.out.println("Okay word");
        }else{
            System.out.println("Invalid");

        }
three.close();
        /*
        write a program that asks the user enter a three letter word. Check if the middle character of the given word
         is 'a'. In the case it is print: "Cool word", but in the case the middle letter is not 'a' print: "Okay word".
         - If the user does not enter a 3 letter word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
         */


    }
}
