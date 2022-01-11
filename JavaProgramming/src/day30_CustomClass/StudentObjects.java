package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student ();
        student1.setInfo("Muhammet", 'M', 47,
                          123, 'a');

        System.out.println(student1);

        student1.eat();
        student1.sleep();
        student1.drink();
        student1.code();

        Student student2 = new Student ();
        student2.setInfo("Bike", 'F', 44,
                1223, 'b');

        Student student3 = new Student ();
        student3.setInfo("Gulya", 'F', 3,
                2123, 'c');

        Student student4 = new Student ();
        student4.setInfo("Nur", 'M', 11,
                2121, 'b');

        Student student5 = new Student ();
        student5.setInfo("Bibi", 'F', 38,
                2122, 'c');

        Student [] students = {student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("_____________________________________________________");

        ArrayList<Student> earlyBirds = new ArrayList<>(); //find who has grade A
        ArrayList<Student> angryBirds = new ArrayList<>(); //find all others who has <A grade

        for (Student student : students) {
            if(student.grade=='a'){
                earlyBirds.add(student);//who has 'a' grade will be added to earlyBirds
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        /* printed out:
        Student{name='Muhammet', gender=M, age=47, ID=123, grade=a}
Muhammet is eating
Muhammet is sleeping
Muhammet is drinking
Muhammet is writing code

         */

    }

}
