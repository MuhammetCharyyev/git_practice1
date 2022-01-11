package day36_Inheritance.animalTask;

public class Zoo_Objects {

    public static void main(String[] args) {


        Dog dog = new Dog();
        dog.setInfo("max", "husky", 'm', 3, "middle", "grey");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();               

        Cat cat = new Cat();
        cat.setInfo("kitty", "pers", 'f', 2, "big", "white");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();
        cat.meow();

        Tiger tiger = new Tiger();
        tiger.setInfo("sher", "bengal", 'm', 4, "large", "orange");

        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        tiger.roar();
        tiger.hunt();

    }
}
