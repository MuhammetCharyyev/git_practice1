package day36_Inheritance.animalTask;

public class Tiger extends Animal_Parent { //class Tiger takes Animal parameters by using "extends"
//          child        parent
//Tiger now has 6 variables and 6 methods inherited from Animal class

    public void hunt(){
        System.out.println(name+" is hunting"); //specific method created for Tiger only
    }

    public void roar(){
        System.out.println(name+" is roaring"); //specific method created for Tiger only
    }
}
