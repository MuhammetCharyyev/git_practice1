package day13_StringClass;

import java.util.Locale;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2);

        System.out.println("thirdChar = " + thirdChar);

        char tenth = word.charAt(2);

        System.out.println("tenth = " + tenth);

        System.out.println("_______________________________________");

        String s1 = "Batch 25 is the best one";

        int numberCharacters = s1.length();

        System.out.println("numberCharacters = " + numberCharacters);

        char lastChar = s1.charAt(s1.length()-1); // or (numberCharacter -1)

        System.out.println("lastChar = " + lastChar);
        System.out.println("_______________________________________");

        String str = "wooden spoon";

        str = str.toUpperCase(); //create new string object "WOODEN SPOON" // must assign str=str.toUpperCase() to get new one

        System.out.println("str = " + str);

        String sentense = "Today is a great day to learn java programming";
        sentense =sentense.toUpperCase();

        System.out.println("sentense = " + sentense);




    }
}
