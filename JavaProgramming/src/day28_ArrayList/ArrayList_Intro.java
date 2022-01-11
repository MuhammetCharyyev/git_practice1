package day28_ArrayList;

import java.util.ArrayList;

public class ArrayList_Intro {

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>(); // to use primitives in ArrayList
        // you need to use Wrapper Class// to indicate data type in <> in second time is optional,
                                        // it will be the same type by default

        ArrayList<String> names = new ArrayList<>(); // to declare ArrayList for String

        System.out.println("numbers = " + numbers); // ArrayList has Arrays.toString by default,
                                                    // no need to indicate
        System.out.println("names = " + names);

    }

}
