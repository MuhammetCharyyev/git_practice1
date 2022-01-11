package day34_GarbageCollection_AccessModifier;

public class StaticMembers_NestedClass {

    static class class1 {
        // nested static class inside the class, 'static' allowed only for inner class
        // outer class cannot be a static
    }

    public static int num = 100; // variable can be static

    public static void method() { // method can be static
    }

    static { // block can be static

    }
}

    class A { // outer class

        static class B{ // inner nested class
            public static void method1(){

            }
        }
    }

    class C{
        public static void main(String[] args) {
        A.B.method1();

    }

}
