package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks_SwapZerosExtractChar {

    public static void main(String[] args) {
//swap the first and last elements
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9));

        Collections.swap(list, 0, list.size()-1);

        System.out.println("list = " + list);

        System.out.println("______________________________________________");

        //move all the zeros to the last indexes
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        int size = numbers.size(); // first: find length
        numbers.removeAll(Arrays.asList(0));// second: remove all 0s
        int newSize = numbers.size();// new size of ArrList without 0s: [1, 2, 3, 4]

        int totalNumberOfZeros = size=newSize;

        System.out.println("totalNumberOfZeros = " + totalNumberOfZeros); //totalNumberOfZeros = 4

        for (int i = 0; i < totalNumberOfZeros; i++) { // check each element of totalNum
            numbers.add(0); // add 0s to the end of numbers
        }

        System.out.println("numbers = " + numbers);

        System.out.println("______________________________________________");

        // second option with creating new ArrList

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>(); // first creat new ArrList

        for (Integer each : list2) {
            if(each != 0){
                result.add(each); // result adding all without 0s
            }
        }

        for (Integer each : list2) {
            if(each == 0){
                result.add(each); // result adding all  0s
            }
        }

        System.out.println(result);

        System.out.println("______________________________________________");

        //extract the special characters, digits and letters from a string

        String str = "ABCD123$%#@&456EFG!";

        ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }

        ArrayList<Character> letters = new ArrayList<>(chars); // collection type of chars
                                                               // add all chars
        System.out.println("letters = " + letters);
//letters = [A, B, C, D, 1, 2, 3, $, %, #, @, &, 4, 5, 6, E, F, G, !]
        letters.removeIf(p-> !Character.isLetter(p));//remove all are not letter chars
        System.out.println("letters = " + letters);
//letters = [A, B, C, D, E, F, G]

        ArrayList<Character> digits = new ArrayList<>(chars); // add all chars again
        digits.removeIf(p-> !Character.isDigit(p));//remove all are not digit chars
        System.out.println("digits = " + digits);
//digits = [1, 2, 3, 4, 5, 6]

        ArrayList<Character> specChar = new ArrayList<>(chars); // add all chars again
        specChar.removeAll(letters); //remove all letters
        specChar.removeAll(digits); //remove all digits

        System.out.println("specChar = " + specChar);
//specChar = [$, %, #, @, &, !]

    }

}
/*
1. write a program that can swap the first and last elements of an ArrayList of Integers

2. Write a program that can move all the zeros to the last indexes of ArrayList

                    Ex:
                        list: {1,0,2,0,3,0,4,0}

                    output:
                        [1, 2, 3, 4, 0, 0, 0, 0]


3. Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
                Ex:
                    str = "ABCD123$%#@&456EFG!"

                output:
                    list1: {1, 2, 3, 4, 5, 6}
                    list2: {A, B, C, D, E, F, G}
                    list3: {$, %, #, @, &, !}
 */