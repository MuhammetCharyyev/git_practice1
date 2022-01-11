package day36_Inheritance.scrum;

public class ProductOwner extends Employee{

    public ProductOwner(String name, int age, char gender, int id, String companyName,double salary) {
        super(name, age, gender, id, companyName, "Product Owner", salary);
    }

    public void productOwn (){
        System.out.println(name+ " " +jobTitle+" is responsible for defining Stories");
    }

}
