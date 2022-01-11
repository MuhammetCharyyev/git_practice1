package day36_Inheritance.scrum;

public class Employee extends Person{
//Extra variables: id, jobTitle, salary
    public int id;
    public String companyName;
    public String jobTitle;
    public double salary;

    public Employee(String name, int age, char gender, int id, String companyName,
                    String jobTitle, double salary) {
        super(name, age, gender);
        this.id = id;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void work(){
        System.out.println(name+ " is working as" +jobTitle+" in a company " +companyName);
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
/*
Create a sub class of Person named Employee
			Extra variables:
				id, jobTitle, salary

			Extra methods:
SetInfo(): sets the name, age, gender, id, jobTitle and salary of Employee Object
Hint: after creating setInfo method of employee class, you can call the inheritend
 setInfo() to set the name, age, and gender

				work()

toString(): generate toString seperately in Employee class so that name, age, gender,
 id, jobTitle and salary of the emplyee can be displayed

 */