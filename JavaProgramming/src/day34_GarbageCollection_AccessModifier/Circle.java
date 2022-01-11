package day34_GarbageCollection_AccessModifier;

import java.util.ArrayList;

public class Circle {

    public double radius; // instance variable , changeable
    public static double pi; // static variable, constant = 3.14 in this case
    public static String name; // name "Circle" is also common then it can be static

    public static ArrayList<Integer> numbers; // if you have a static variable
    // which has more than one step to execute then you need a Static block


    public Circle (double radius){
        this.radius=radius;
       // pi=3.14; // you cannot use "this" for static, just assign a data,
        // you don't have to ever initialize static variable in the Constructor coz
        // it's overload for compiler, Constructor only for instances
    }

   static {
        pi =3.14;
        name="Circle";
        numbers = new ArrayList<>();
        // this static block concerns to static variable as several steps
        numbers.add(10);
        numbers.add(20);
    }



    public static void main(String[] args) {
        // you can also use a main method to set a static members, coz it's also static
        // but you cannot use main method outside the class, then you need to use only a 'static'
        pi =3.14;
        name="Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);


    }

}
