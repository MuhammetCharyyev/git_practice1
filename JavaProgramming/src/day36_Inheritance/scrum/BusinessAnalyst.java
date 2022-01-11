package day36_Inheritance.scrum;

public class BusinessAnalyst extends Employee{

    public BusinessAnalyst(String name, int age, char gender, int id, String companyName, double salary) {
        super(name, age, gender, id, companyName, "Business Analyst", salary);
    }

    public void busAnalyst (){
        System.out.println(name+ " " +jobTitle+" is analysing data");
    }

}
