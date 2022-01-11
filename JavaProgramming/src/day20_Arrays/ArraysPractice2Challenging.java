package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice2Challenging {

    public static void main(String[] args) {

        char[] letters = new char[26];



        for (char i = 'A', j= 0; i <='Z' && j < letters.length ; i++, j++) { // way to use 2 variable in one
            // i: represents char value (because every single char has a number)
            // j: represents index num
            letters[j]=i;
        }

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) { // this is the second option which supposed to be easyier way
            letters[i]=ch++;
        }

        System.out.println(Arrays.toString(letters));

        System.out.println("____________________________________________________");

        char[] letters2 = new char[26]; // Z~A

    }

}
