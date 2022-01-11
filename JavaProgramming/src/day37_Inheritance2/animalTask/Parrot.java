package day37_Inheritance2.animalTask;

public class Parrot extends Animal{

    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    public void speak(){
        System.out.println(name+" is speaking");
    }

}
