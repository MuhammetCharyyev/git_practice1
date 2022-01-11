package day37_Inheritance2.animalTask;

public class Dog extends Animal{


//as child class cannot create constructor coz it extends the parent class then we have to use super()
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void bark(){
        System.out.println(name + " is barking");
    }

}
