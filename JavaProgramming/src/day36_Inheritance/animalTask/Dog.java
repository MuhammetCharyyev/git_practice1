package day36_Inheritance.animalTask;

public class Dog extends Animal_Parent { //class Dog takes Animal parameters by using "extends"
//          child        parent
//Dog now has 6 variables and 6 methods inherited from Animal class

    public void bark(){
        System.out.println(name+" is barking"); //specific method created for Dog only
    }

}
