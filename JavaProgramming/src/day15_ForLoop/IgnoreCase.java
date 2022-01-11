package day15_ForLoop;

import java.lang.ref.SoftReference;

public class IgnoreCase {

    public static void main(String[] args) {

        String s1 = "Cydeo";
        String s2 = "cydeo";

        System.out.println(s1.equalsIgnoreCase(s2)); // ignored upper or lower case in words

        //yes, Yes, YEs, YES, yES


        System.out.println("yEs".equalsIgnoreCase("Yes"));// another usefull way to print statement
    }
}
