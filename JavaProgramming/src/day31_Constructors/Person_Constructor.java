package day31_Constructors;

public class Person_Constructor {

    public String name;
    public char gender;
    public int age;

    public Person_Constructor(String name, char gender, int age){
        // constructor which replace and simplify setInfo method
        this.name=name;
        this.gender=gender;
        this.age=age;
    }

    public String toString() {
        return "Person_Constructor{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
