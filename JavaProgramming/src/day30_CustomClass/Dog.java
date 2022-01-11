package day30_CustomClass;

public class Dog {// custom class name

  //make attributes for Dog object
    public String name;
    public String breed;
    public int age;
    public char gender;
    public String size;
    public String color;

    public void setInfo(String dogName, String dogBreed, int dogAge, char dogGender,
                        String dogSize, String dogColor) { // method is created to
                                                           // avoid repetition steps
                                                          // in indicating info
      name=dogName;
      breed=dogBreed;
      age = dogAge;
      gender = dogGender;
      size = dogSize;
      color =dogColor;
    }

    //creat methods for exact name
    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void bark(){
        System.out.println(name+ " is barking");
    }

   /* public String toString(){ // method to print out created for 'name' in this case
      return "Name: "+name; // return method is a MUST
    }

    */

    public String toString() { // generated method to print out all object
        //right button->Generate->select toString-> remove Insert @Overide->push OK
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';


    }
}
/*
Attributes:
name, age, gender, breed, size,color

Actions:
eat(), play(), bark(), sleep()
 */