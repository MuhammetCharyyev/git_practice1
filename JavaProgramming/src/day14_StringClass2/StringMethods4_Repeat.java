package day14_StringClass2;

public class StringMethods4_Repeat {

    public static void main(String[] args) {

        String str = "Cydeo";

        String str2 = str.repeat(4); //"CydeoCydeoCydeoCydeo"

        String str3 = " Wooden Spoon ";

        String str4 = str3.repeat(100); //repeat 100 times back to back
        System.out.println(str4);

        System.out.println("_______________________");

        System.out.println("FADY \n".repeat(15));
        System.out.println("_______________________");

        String name = "Java";

        System.out.println( (name + " ").repeat(5));

    }
}
