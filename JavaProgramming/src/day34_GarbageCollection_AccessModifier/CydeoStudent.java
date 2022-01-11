package day34_GarbageCollection_AccessModifier;

public class CydeoStudent {

    public String studentName;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName = studentName;
    }

    static{ // created separately for static only to not overload compiler
        schoolName = "Cydeo School";
    }

}

class CydeoStudentObject{ // objects inside the class

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Jimmy");
        CydeoStudent student2 = new CydeoStudent("Kathy");

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);

    }

}
