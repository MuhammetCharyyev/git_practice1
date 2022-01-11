package day31_Constructors.scrumTask;

public class Tester {
    //Attributes:
    //	            name, employeeID, JobTitle, Salary
    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;
   // Add a constructor that can set all the fields
    public Tester(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }
// Actions:
//	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }



}
/*
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary

	        Add A constructor that can set all the fileds

	        Actions:
	           smokeTesting(),  creatingTicket(), dailyStandUp() toString()
 */