package day34_GarbageCollection_AccessModifier;

public class AccessModifiers_Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData); //public is reachable in the same package
        System.out.println(AccessModifiers.defaultData);//default is reachable in the same package
     // System.out.println(AccessModifiers.privateData);// private is reachable only in the same class

        AccessModifiers.method1(); //public method was created on AccessModifiers class
        AccessModifiers.method2(); //default method was created on AccessModifiers class
        //AccessModifiers.method3();
        //private method was created on AccessModifiers class//not visible in other class


    }

}
