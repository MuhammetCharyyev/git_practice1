package day36_Inheritance.scrum;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int id, String companyName,
                     String jobTitle, double salary) {
        super(name, age, gender, id, companyName, jobTitle, salary);
    }

    public void develop(){
        System.out.println(name+ " " +jobTitle+" is programming");
    }

}
