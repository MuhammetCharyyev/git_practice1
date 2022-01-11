package utilities;

import day34_GarbageCollection_AccessModifier.AccessModifiers;

public class AccessModifiers_Test2 {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicData); //public is visible even in other package
       // System.out.println(AccessModifiers.defaultData);
        //default is not visible in other package, only in its own package
       // System.out.println(AccessModifiers.privateData);// private is only visible in its class


        AccessModifiers.method1();
        //public method was created on AccessModifiers class//always visible everywhere

        //AccessModifiers.method2(); //default method was created on AccessModifiers class
        //not visible in other package

        //AccessModifiers.method3();
        //private method was created on AccessModifiers class//not visible in other class


    }

}
