package day01_JavaIntro;

import day24_CustomMethod_Return.ReturnMethod_Intro;
import day24_CustomMethod_Return.ReturnMethod_Practice4_RemoveDuplicates;

public class Test_ImportFromOthersPackage {
    public static void main(String[] args) {

        String str = "aaddtvvff";

       str= ReturnMethod_Practice4_RemoveDuplicates.removeDuplicates(str); // import Return Method from
        //another package

        System.out.println(str);

        String name = "Java Program";

        String reversed= ReturnMethod_Intro.reverse(name);

        System.out.println(reversed);

    }

}
