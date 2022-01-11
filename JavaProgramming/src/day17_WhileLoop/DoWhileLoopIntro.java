package day17_WhileLoop;

public class DoWhileLoopIntro {

    public static void main(String[] args) {
        boolean a = false;

        for (int i = 0; a;) {
            System.out.println("Wooden spoon - for loop"); // never be executed because false already
        }

        while (a) {
            System.out.println("Wooden Spoon-while loop"); // never be executed because false already
        }

        System.out.println("_________________________________________");

        do {
            System.out.println("Wooden Spoon-do-while loop"); // will be executed statement first then check condition
            // if false then it will be stopped if true will return to the statement
        } while (a);



    }
}
