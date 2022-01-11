package day31_Constructors;

public class Person_Objects {

    public static void main(String[] args) {

        Person_Constructor person1 = new Person_Constructor("daniel", 'm', 32);
        // creating an object without setInfo calling

        Person_Constructor person2 = new Person_Constructor("mary", 'f', 28);
        // creating second object without setInfo calling

        person2.age = 30; //in case if you want to make changes in some parameters

        System.out.println(person1); //Person_Constructor{name='daniel', gender=m, age=32}
        System.out.println(person2); //Person_Constructor{name='mary', gender=f, age=28}

    }

}
