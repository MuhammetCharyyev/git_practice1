package day32_ConstructorOverloading;

public class Employee_Overloading {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

    public Employee_Overloading(String name) {
        this.name = name;
    }

    public Employee_Overloading(String name, char gender) {//overloaded constructor to
                                                         // allow you to use by several options
        this(name);// call the constructor of previous created method, 'String name' in this case
        //this needs to not duplicate as below
        this.gender = gender;
    }

    public Employee_Overloading(String name, char gender, String jobTitle) {
                                //third time overloaded constructor with 3 parameters in this case
      this(name, gender);
      // called from above constructors to replace this.gender = gender and this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee_Overloading(String name, char gender, String jobTitle, double salary) {
        this(name,gender,jobTitle); // called from above constructors
        this.salary = salary;
    }

    public String toString() {
        return "Employee_Overloading{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
