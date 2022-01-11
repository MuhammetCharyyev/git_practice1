package day33_Statics;

import java.util.Arrays;

public class StudentObjects_WarmUp {

    public static void main(String[] args) {

        Student_WarmUp student1 = new Student_WarmUp("Ahmet");
        //just name from Student_WarmUp constructor

        Student_WarmUp student2 = new Student_WarmUp("Aygun", 'F');
        //just name and gender from Student_WarmUp constructor

        Student_WarmUp student3 = new Student_WarmUp("Nigara", 11);
        //just name and id from Student_WarmUp constructor

        Student_WarmUp student4 = new Student_WarmUp("Mert", 12, 'A');
        //just name, id and grade from Student_WarmUp constructor

        Student_WarmUp student5 = new Student_WarmUp("Cihad", 'M', 28);
        //just name, gender  and age from Student_WarmUp constructor

        Student_WarmUp student6 = new Student_WarmUp("Suhaib", 'M', 27, 14);
        //just name, gender, age and id from Student_WarmUp constructor

        Student_WarmUp student7 = new Student_WarmUp("Ali", 'M', 42, 15, 'A');
        //just name, gender, age, grade and id from Student_WarmUp constructor

        System.out.println(student1==student2); // false

        Student_WarmUp[] students = {student1, student2, student3, student4, student5, student6, student7};

        System.out.println(Arrays.toString(students));


    }

}
