package day14_StringClass2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TwoWordsNoFirst {

    public static void main(String[] args) {

        Scanner first = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = first.nextLine();

        System.out.println("Enter second word:");
        String secondWord = first.next();
        String firstLetter1 = firstWord.substring(1, firstWord.length());
        String firstLetter2 = secondWord.substring(1, secondWord.length());

        System.out.println(firstLetter1+firstLetter2);

first.close();

    }
}
