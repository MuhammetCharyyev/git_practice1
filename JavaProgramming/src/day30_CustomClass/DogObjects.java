package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {

    public static void main(String[] args) {

      Dog dog1  = new Dog(); // Dog was taken from class 'Dog'

        dog1.name = "Lucy"; //called .name from created 'Dog' class
        dog1.breed = "Husky"; //called .breed from created 'Dog' class
        dog1.age = 5; //called .age from created 'Dog' class
        dog1.gender ='F'; //called .gender from created 'Dog' class
        dog1.size = "Small"; //called .size from created 'Dog' class
        dog1.color ="White"; //called .color from created 'Dog' class

        //now how to print? we need to creat a method. We created only eat() and bark()

        System.out.println(dog1); // will be printed out if you created method
        //               in separate class, 'Dog' in this case
       // Dog{name='Lucy', breed='Husky', age=5, gender=F, size='Small', color='White'}

        Dog dog2 =new Dog();
        //another object
        dog2.name = "Ace";//called .name from created 'Dog' class
        dog2.breed = "Husky"; //called .breed from created 'Dog' class
        dog2.age = 5; //called .age from created 'Dog' class
        dog2.gender ='M'; //called .gender from created 'Dog' class
        dog2.size = "Large"; //called .size from created 'Dog' class
        dog2.color ="White&Black"; //called .color from created 'Dog' class

        System.out.println(dog2);
        //Dog{name='Ace', breed='Husky', age=5, gender=M, size='Large', color='White&Black'}

        Dog dog3 =new Dog();
        dog3.setInfo("Jack", "Shepard", 2, 'M', "Large",
        "White"); // setInfo is called created method from 'Dog' class

        System.out.println(dog3);
        //Dog{name='Jack', breed='Shepard', age=2, gender=M, size='Large', color='White'}

        dog1.eat(); //called method from 'Dog' class
        //"Lucy is eating" is printing
        dog2.bark(); //called method from 'Dog' class
        //"Ace is barking" is printing

      Dog dog4 =new Dog();
      dog4.setInfo("Bullet", "Labrador", 3, 'M',
              "Extra Large", "Yellow");

      Dog dog5 =new Dog();
      dog5.setInfo("Sully", "Pit-Bull", 6, 'F',
              "Large", "Black");

     // Dog[] dogs = {dog1,dog2,dog3,dog4,dog5}; // find which one is male and which one is female
      // for 1st solution use loop and for second dont use loop

      ArrayList<Dog> femaleDog = new ArrayList<>();
      femaleDog.addAll(Arrays.asList(dog1,dog2, dog3,dog4,dog5));

      for(Dog each:femaleDog){
        if(each.gender=='F'){
          femaleDog.retainAll(Arrays.asList(each));//who has 'F' gender will be added to femaleDog
          System.out.println(femaleDog);
        }
      }



      ArrayList<Dog> maleDog = new ArrayList<>();
      maleDog.addAll(Arrays.asList(dog1,dog2, dog3,dog4,dog5));

    maleDog.removeIf(p-> p.gender =='F');

      System.out.println(maleDog);
    }

}
