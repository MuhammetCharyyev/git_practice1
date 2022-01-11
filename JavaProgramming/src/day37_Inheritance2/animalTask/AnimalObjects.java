package day37_Inheritance2.animalTask;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Lucy", "husky", 'f', 2, "middle", "grey");
        dog1.bark();
        dog1.drink();
        dog1.eat();
        dog1.move();

        System.out.println(dog1);

        Cat cat1 = new Cat("Tom", "pers", 'm', 1, "small", "black");
        cat1.scratch();
        System.out.println(cat1);

        Parrot parrot1 = new Parrot("Popka", "blue", 'm', 200, "big", "blue");

        parrot1.speak();

        System.out.println(parrot1);

    }

}
