package day35_Encapsulation.encapsulation;

public class Person {

    private String name; // private to make it secure// you own it and you control it
    private int age;


    //shortcut=> rightClick->Generate->Getters and Setters
    public String getName() {//getter
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() { //getter
        return age;
    }

    public void setAge(int age) { //setter
        if(age<=0 || age>150){
        // in case if user enters invalid digits//you keep this under control because it's private
            System.err.println("invalid age: "+age);
            System.exit(0);
        }
        this.age = age;
    }
}
