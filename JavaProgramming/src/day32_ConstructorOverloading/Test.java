package day32_ConstructorOverloading;

public class Test {

    public Test(){ //default constructor
        System.out.println("A");
    }

    public Test(int a){ //second constructor with adding int// output AB
        this();
        System.out.println("B");
    }

    public Test(double a){ //third constructor with adding double// output ABC
        this(10); //called from above int
        System.out.println("C");
    }

    public Test(String str){ //fourth constructor with adding String// output ABCD
        this(2.5); //called from above double
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Test("Java");
    }

}
