package day14_StringClass2;

import javax.lang.model.SourceVersion;

public class StringMethods2 {

    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";

        str = str.replace("Java", "Python"); // replace one string to another but you have to indicate
        // new word and assign variable

        System.out.println(str);

        String email = "JohnSmith@yahoo.com";
        String email2 = email.replace("yahoo", "gmail"); // another method to show both variants

        System.out.println(email);
        System.out.println(email2);

        String sentence = "Java Java Python Python C+ C# C++ Python Python";
        String sentence2= sentence.replace("Python", "").replace("   ", " ");
        // after removing word ==> replaces 3 spaces by one
        // help to remove word "Python" and change by empty place
        // include spaces as well to remove them
        System.out.println(sentence);
        System.out.println(sentence2);

        System.out.println("______________________________");

        String s = "Dog Dog Dog Dog Dog Dog";
        String s2 =s.replace("Dog", "Cat");

        System.out.println("s = " + s);
        System.out.println("s2 = " + s2);

        System.out.println("______________________________");

        String s3 = "C+ is fun, C+ is cool"; // replace the second C+ only
        s3= s3.replace(" C+", " Java"); // space has to be added in the both places

        System.out.println("s3 = " + s3);

        String s4 = "Java";
        s4 = s4.replace("a", "e"); //"Jeve"

        System.out.println("______________________________");

        String result = "Java Java Java";
        result = result.replaceFirst("Java", "Python");

        System.out.println(result);






    }
}
