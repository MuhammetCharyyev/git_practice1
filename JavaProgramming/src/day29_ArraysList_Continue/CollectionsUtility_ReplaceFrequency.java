package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility_ReplaceFrequency {

    public static void main(String[] args) {
// what if I want replace several elements by other
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,1));

        Collections.replaceAll(list, 1, 0); // replaces all 1s by 0s

        System.out.println("list = " + list);

        System.out.println("______________________________________________");

        // what if I want to find frequency of element

        int frequency = Collections.frequency(list, 0); // find frequence of 0s of ArrList
                                                        // need to assign to int

        System.out.println("frequency = " + frequency); //frequency = 3

        System.out.println("______________________________________________");
//what if I want to find if one string frequency is equal to other
        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Python", "Java", "Ruby", "Python"));

        int countJava = Collections.frequency(words, "Java"); //show frequency of "Java"
        int countPython = Collections.frequency(words, "Python");//show frequency of "Python

        System.out.println("countJava = " + countJava); //countJava = 2
        System.out.println("countPython = " + countPython);//countPython = 2

    }

}
