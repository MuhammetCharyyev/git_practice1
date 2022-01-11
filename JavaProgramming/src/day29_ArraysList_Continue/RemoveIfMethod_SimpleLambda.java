package day29_ArraysList_Continue;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod_SimpleLambda {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        /* what if I want to remove all odd numbers?

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){

         */

        list.removeIf(p-> p<5); // remove that matching to this condition; Lambda expression
                               // remove everything that < 5
                              // -> Java recognise as Lambda expression
        //[5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9]
        System.out.println("list = " + list);

        System.out.println("______________________________________________");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        // what if I want to remove all even numbers?

        list2.removeIf(each-> each%2==0); // you can also name as you want "each" for example
                                          // "each" represent each element in ArrList
        System.out.println("list2 = " + list2);
        //list2 = [1, 3, 5, 7, 9]

        System.out.println("______________________________________________");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++", "Java"));
        // want to remove all elements starting with "J"

        list3.removeIf(p-> p.startsWith("J")); // remove all "J" words
                                              // you can also use p.contains("#") to remove
                                              // everything with # symbol , for example

        System.out.println("list3 = " + list3);
        //list3 = [Python, C#, C++]

        System.out.println("______________________________________________");

        //what if I want to remove palindromes
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("level", "john", "aisha", "dan", "muha", "anna"));
        
       names.removeIf(name-> StringUtility.isPalindrome(name));// call method from StringUtility
                                                               // to indicate palindrome

        names.removeIf(name-> !StringUtility.isPalindrome(name));//you can also remove non-palidromes
                                                                 //names = [level, anna]
        System.out.println("names = " + names);
        //names = [john, aisha, dan, muha]

    }

}
