package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

       Employee employee1 = new Employee("Muhammet", 'M', 48, 350000);
        //called from constructor
        employee1.setAge(32);// in case if you want to change something
        System.out.println(employee1);

        Employee employee2 = new Employee("", 'f', -1, 0);
        employee2.setSalary(employee2.getSalary()+15000);
        //in case if you want to amend some variable
        System.out.println(employee2);

    }

}
