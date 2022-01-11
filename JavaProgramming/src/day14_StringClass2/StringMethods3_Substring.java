package day14_StringClass2;

public class StringMethods3_Substring {

    public static void main(String[] args) {
        // substring(beginning and ending indexes)

        String word = "Cydeo School";
        // index       01234567891011

        String brand = word.substring(0, 4); //first and five symbol
        // String brand = word.substring(0, 4 +1); if you want to "Cydeo"

        System.out.println(brand);

        String str = word.substring(6);

        System.out.println(str);

        System.out.println("_______________________");

        String word2 = "Java Programming Language";

        String s1 = word2.substring(0, word2.indexOf(" ")); // "Java" way to find the first word
        String s2 = word2.substring(word2.indexOf("P"), word2.lastIndexOf(" ")); // or word2.indexOf(" ")+1)
        //if the word is starting from the same letter as first word
        String s3 = word2.substring(word2.indexOf("L")); // or (word2.lastIndexOf(" ") +1)


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }

}
