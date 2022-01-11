package day34_GarbageCollection_AccessModifier;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_ConstructorOverloading.Car;
import day33_Statics.Iphone;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        str = null;
        // assigning the null is making non-primitive objects eligible for garbage collection
        //garbage takes object from the heap to further destroy

        System.out.println(str);

        Car car1 = new Car("toyota"); // taken from Car class

        car1 = null; // make also unreference

        System.out.println(car1);

        System.out.println("___________________________________________________");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

        dog1 = new Dog();
        // If you make re-reference for the object then you may prepare for garbage
        dog1.name = "max";

        System.out.println(dog1);

        String language = "Python";
        language = "Java"; //re-referencing makes the previous object be destroyed

        System.out.println(language);

        System.out.println("___________________________________________________");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);

        ArrayList<Integer> list2 = list1;

        list2.addAll(Arrays.asList(200,300,400));

        System.out.println(list1); //[100, 200, 300, 400] // same as list2 coz it is assigned
        System.out.println(list2);//[100, 200, 300, 400] //added to list1 and list2 objects

        System.out.println(list1==list2); //true

        System.out.println("___________________________________________________");

        Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1; // only one student object is created as here is assignment
        student2.name = "Ahmet";

        System.out.println(student1); //Student{name='Ahmet', age=30, gender=M, grade=A, id=14}
        System.out.println(student2);//Student{name='Ahmet', age=30, gender=M, grade=A, id=14}

        System.out.println("___________________________________________________");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = new ArrayList<>(); // if you dont assign then the previous object will be executed

        System.out.println(l1); //[Java]
        System.out.println(l2); //[]



    }

}
