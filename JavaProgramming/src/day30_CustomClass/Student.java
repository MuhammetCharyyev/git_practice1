package day30_CustomClass;

public class Student {

    //make attributes for 'Student' object
    public String name;
    public char gender;
    public int age;
    public int ID;
    public char grade;

     //you can also make shortcut to create setInfo:
    //right button->Generate->select Constructor-> select all points->push OK
     // ->change class name to void "setInfo"
    public void setInfo(String name, char gender, int age, int ID, char grade) {
                                            // method is created to
                                           // avoid repetition steps in indicating info

        this.name=name; // this. (or this keyboard) is using to differentiate public 'name'
                        // from local variable 'name'
        this.gender=gender;
        this.age= age;
        this.ID = ID;
        this.grade =grade;
    }

    public void eat(){
        System.out.println(name+ " is eating");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void drink(){
        System.out.println(name + " is drinking");
    }

    public void code(){
        System.out.println(name + " is writing code");
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ID=" + ID +
                ", grade=" + grade +
                '}';
    }
}

