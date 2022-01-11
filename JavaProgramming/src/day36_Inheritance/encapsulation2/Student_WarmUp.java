package day36_Inheritance.encapsulation2;

public class Student_WarmUp {
// private variables:
//  name, age, gender, grade, schoolName
    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    //one static object
    public static boolean isStudent =true;


    public Student_WarmUp(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setName(String name) {
        this.name = name;
    }
//age should not be set less than 5 or greater than 90
    public void setAge(int age) {
        if(age<5 || age>90){
            System.err.println("wrong entry of age: " +age);
            return;
        }
        this.age = age;
    }
//gender should not be set to any chanarcter other than: 'M' and 'F'
    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
            System.err.println("wrong entry of gender: " +gender);
            return;
        }
        this.gender = gender;
    }
//grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'
    public void setGrade(char grade) {
        if (!(grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'F')) {
            System.err.println("wrong entry of grade: " +grade);
            return;
        }
        this.grade = grade;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
//  Methods: study()  toString()
    public void study(){
        System.out.println(name+ " is studying in " +schoolName);
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
/*
Create a class named Student:
            private variables:
                name, age, gender, grade, schoolName

            Encapsulate all the fileds (at leat encapsulate two fields manually)
                    requirments:
       1. age should not be set less than 5 or greater than 90
       2. gender should not be set to any chanarcter other than: 'M' and 'F'
       3. grade should not be set to any chanacters other than: 'A', 'B', 'C', 'D', and 'F'

            Add a constructor that can set all teh fields when the object is created
                        (requirments of fileds in the above must be applied)


            Methods:
                study()
                toString()
 */