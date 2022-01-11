package day16_ForLoopStringPractice;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";

        String result = "";

        for (int i = 0; i < str.length(); i++) { //i: index numbers os string starting from 0

            char ch = str.charAt(i); // ch: each character of string

            if (str.indexOf(ch) == str.lastIndexOf(ch)) { // if the first and last index numbers of character are same then
                //the character is unique
                result += ch;

            }
        }
        System.out.println(result);


    }

}
/*
Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */