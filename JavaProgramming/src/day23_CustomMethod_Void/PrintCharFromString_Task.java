package day23_CustomMethod_Void;

public class PrintCharFromString_Task {

    public static void main(String[] args) {


        printEachChar("as.kdghjgktre");

    }

    public static void printEachChar(String str) {

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }

}
//create a method named printEachChar that can print each characters of a string