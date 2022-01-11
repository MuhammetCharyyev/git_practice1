package day32_ConstructorOverloading;

public class ConstructorCalls {

    public ConstructorCalls() { // first default constructor
        System.out.println("default constructor");
    }

    public ConstructorCalls(int a) { //second created constructor with adding int
        this(); // call constructor has to be on the first step// as first is default then this()
        System.out.println(" constructor with int argument");
    }

    public ConstructorCalls(String str) { //third created constructor with adding String
        this(10); //called from int constructor
        System.out.println(" constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls(); //prints :"default constructor"

        System.out.println("______________________________________________________");

        ConstructorCalls obj2 = new ConstructorCalls(10);
        // prints :
        // "default constructor"
        // "constructor with int argument"

        System.out.println("______________________________________________________");

        ConstructorCalls obj3 = new ConstructorCalls("Java");
        // prints :
        //default constructor
        // constructor with int argument
        // constructor with String argument


    }

}
