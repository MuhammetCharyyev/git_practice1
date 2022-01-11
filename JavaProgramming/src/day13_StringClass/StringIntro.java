package day13_StringClass;

public class StringIntro {

    public static void main(String[] args) {

        String word = "Wooden Spoon";
        String word2 = "Wooden Spoon";

        System.out.println(word2 ==word); // true

        String word3 = new String("Wooden Spoon");
        String word4 = new String("Wooden Spoon");

        System.out.println(word4 == word3); //false

        System.out.println("______________________________");

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1.equals(str2)); //true ==> new object to equal objects "equals"



    }
}
