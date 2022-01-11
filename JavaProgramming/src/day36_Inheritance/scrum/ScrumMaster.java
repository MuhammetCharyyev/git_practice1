package day36_Inheritance.scrum;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, String companyName,double salary) {
        super(name, age, gender, id, companyName, "Scrum Master", salary);
    }

    public void scrumMaster(){
        System.out.println(name+ " " +jobTitle+" helps to facilitate scrum");
    }

}
