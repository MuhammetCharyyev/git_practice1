package day34_GarbageCollection_AccessModifier;
import static day34_GarbageCollection_AccessModifier.Circle.pi;
// using the import of static variables from other class
import static day34_GarbageCollection_AccessModifier.Circle.*;
// you can also use '*' => sign to call all statics from the other class

public class StaticImport {

    public static void main(String[] args) {
        System.out.println(pi); // direct reference to the variable of the other class

    }

}
