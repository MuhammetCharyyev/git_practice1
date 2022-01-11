package day15_ForLoop;

import java.util.Locale;

public class EndWith {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        boolean x = str.endsWith("Wooden");
        boolean z = str.toLowerCase().startsWith("wooden");// ignore lower case// to ignore case sensitivity we must create
        // lower case or upper case of string

        System.out.println(x);
        System.out.println(z);

    }

}
