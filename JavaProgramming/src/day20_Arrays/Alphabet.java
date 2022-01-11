package day20_Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        char[] alphabet = new char[26]; // Z~A
/*
        alphabet[0] = 'Z'; // number in ASCI table is 90
        alphabet[1] = 'Y'; // number in ASCI table is 89
        alphabet[2] = 'X'; // number in ASCI table is 89

 */

        for (char i = 'Z', j = 0; i >= 'A' && j < alphabet.length; i--, j++) { // way to use 2 variable in one
            // i: represents char value (because every single char has a number)
            // j: represents index num
            alphabet[j] = i;
        }
/*

Second option
        char ch = 'Z';
        for (int i = 0; i < alphabet.length; i++, ch--) {
            // this is the second option which supposed to be easier way
            alphabet[i]=ch;
        }

 */

        // third option:

        for (char i = 0, j ='Z'; i < alphabet.length; i++, j--) { // no second j here because when length will
            //be reached end it will be stopped
            alphabet[i]=j;

        }

        System.out.println(Arrays.toString(alphabet)); // converts array to string, otherwise it will not printed out
        //  System.out.println(alphabet[0]); // print element only of array


    }

}
