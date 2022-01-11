package day35_Encapsulation.encapsulation;

public class Employee {

    private String name; // private to make it secure// you own it and you control it
    private char gender;
    private int age;
    private double salary;

    public Employee(String name, char gender, int age, double salary) {
        //use the constructor to call it in objects
        setName(name); //use 'set' method instead of 'this'
        setGender(gender);
        setAge(age);
        setSalary(salary);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            return;
           // System.err.println("invalid entry: " + name);
            //System.exit(0);
            //or you can use 'return' without err to exit the execution of name only
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (!(gender == 'M' || gender == 'F')) {
//            System.err.println("invalid entry: " + gender);
//            System.exit(0);
            return;
        }
        //or you can use 'return' without err to exit the execution of gender only
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<=16 || age>90){
        // in case if user enters invalid digits//you keep this under control because it's private
//            System.err.println("invalid age: "+age);
//            System.exit(0);
            return;
            //or you can use 'return' without err to exit the execution of age only
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<=0){
            // in case if user enters invalid digits//you keep this under control because it's private
//            System.err.println("invalid entry: "+salary);
//            System.exit(0);
            return;
            //or you can use 'return' without err to exit the execution of salary only
        }
        this.salary = salary;
    }



    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", salary= $" + salary +
                '}';
    }
}
