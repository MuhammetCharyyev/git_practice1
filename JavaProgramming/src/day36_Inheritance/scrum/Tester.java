package day36_Inheritance.scrum;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, int id, String companyName,
                  String jobTitle, double salary) {
        super(name, age, gender, id, companyName, jobTitle, salary);
    }

    public void test(){
        System.out.println(name+ " " +jobTitle+" is testing");
    }

}
