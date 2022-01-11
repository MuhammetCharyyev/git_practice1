package day34_GarbageCollection_AccessModifier;

public class AccessModifiers {

    public static int publicData = 100; // public variable //is always visible everywhere
    static int defaultData = 200; // default or non-access modifier
    private static int privateData = 300; // private variable

    public static void method1(){
        System.out.println("public");
    }
    static void method2(){
        System.out.println("default");
    }
    private static void method3(){
        System.out.println("private");
    }

    public static void main(String[] args) {

        System.out.println(publicData); // reachable in the same class
        System.out.println(defaultData);// reachable in the same class
        System.out.println(privateData);// reachable in the same class

    }

}
