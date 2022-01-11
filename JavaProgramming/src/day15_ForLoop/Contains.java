package day15_ForLoop;

public class Contains {

    public static void main(String[] args) {

        String sentence = "My favorite programming language is Java";
        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJavaLowCase = sentence.contains("java");
        boolean hasJavaLowCase2 = sentence.toLowerCase().contains("java");
        boolean hasJava2 = sentence.contains("java") || sentence.contains("Java"); // jAvA

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJavaLowCase);
        System.out.println(hasJavaLowCase2);

        System.out.println("__________________________________________");

        String input1 ="I love Java";
        String input2 = "Java";

        System.out.println(input1.equalsIgnoreCase(input2)); // false
        System.out.println(input1.equals(input2)); // false

        System.out.println(input1.contains("Java"));// true

        System.out.println(input1.toLowerCase().contains("java"));// ignored low case sensitivity
        System.out.println(input1.toUpperCase().contains("JAVA")); // ignored upper case sensitivity

    }

}
