package day25_CustomMethod_Overloading;

public class MainMethodOverloading {

    public static void main(String[] args) {

        System.out.println("String");  // every method in Java can be overloaded
        //but the first one will be executed

    }

    public static void main(int[] args) {

        System.out.println("int");
    }

    public static void main(double[] args) {

        System.out.println("double");
    }

    public static void main(char[] args) {

        System.out.println("char");
    }

}
