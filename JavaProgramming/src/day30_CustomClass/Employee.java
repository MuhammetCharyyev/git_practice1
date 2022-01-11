package day30_CustomClass;

public class Employee {

    //make attributes for 'Employee' object
    public String name;
    public String jobTitle;
    public int ID;
    public char gender;
    public int age;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, String jobTitle, int ID, char gender, int age,
                    double salary, boolean isFullTime) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public void work(){System.out.println(jobTitle+ " "+name+ " is working");}


    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", age=" + age +
                ", salary= $" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }
}
