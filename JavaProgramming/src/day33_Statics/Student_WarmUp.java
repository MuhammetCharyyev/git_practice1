package day33_Statics;

public class Student_WarmUp {

    // Attributes: name, gender, age, studentID, grade
    public String name;
    public char gender;
    public int age;
    public int id;
    public char grade;
//Add a constructor that allows user to create object by setting the name of student
    public Student_WarmUp(String name) {
        this.name = name;
    }
//Add a constructor that allows user to create object by setting the name and gender of the student
    public Student_WarmUp(String name, char gender) {
        this(name);
        this.gender = gender;
    }
//Add a constructor that allows user to create object by setting the name and studentID
//  of the student
    public Student_WarmUp(String name, int id) {
        this (name);
        this.id = id;
    }
//Add a constructor that allows user to create object by setting the name,
//studentID and grade of the student
    public Student_WarmUp(String name, int id, char grade) {
        this(name, id);
        this.grade = grade;
    }
// Add a constructor that allows user to create object by setting the name,
//  gender and age of the student
    public Student_WarmUp(String name, char gender, int age) {
        this(name,gender);
        this.age = age;
    }
//Add a constructor that allows user to create object by setting the name, gender,
// age and studentID of the student
    public Student_WarmUp(String name, char gender, int age, int id) {
        this(name, gender,age);
        this.id = id;
    }
//Add a constructor that allows user to create object by setting the name, gender,
 //   age, studentID and grade of the student
    public Student_WarmUp(String name, char gender, int age, int id, char grade) {
        this(name, gender,age,id);
        this.grade = grade;
    }



    public String toString() {
        return "Student_WarmUp{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", id=" + id +
                ", grade=" + grade +
                '}';
    }
}
/*
Student Task:
        1. Create a class called Student:
                Attributes:
                    name, gender, age, studentID, grade
 Add a constructor that allows user to create object by setting the name of student
 Add a constructor that allows user to create object by setting the name and gender of the student
 Add a constructor that allows user to create object by setting the name and studentID
  of the student
Add a constructor that allows user to create object by setting the name,
studentID and grade of the student
 Add a constructor that allows user to create object by setting the name,
  gender and age of the student
 Add a constructor that allows user to create object by setting the name, gender,
 age and studentID of the student
Add a constructor that allows user to create object by setting the name, gender,
age, studentID and grade of the student

                Actions:
                    toString()
                    study()
 */