package day36_Inheritance.animalTask;

    public class Cat extends Animal_Parent { //class Cat takes Animal parameters by using "extends"
//          child        parent
//Cat now has 6 variables and 6 methods inherited from Animal class

        public void meow(){
            System.out.println(name+" is meowing"); //specific method created for Cat only
        }

        public void scratch(){
            System.out.println(name+" is scratching"); //specific method created for Cat only
        }

}
