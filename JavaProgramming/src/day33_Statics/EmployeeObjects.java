package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 110000;
        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        employee2.salary = 120000;
        Employee employee3 = new Employee();
        employee3.name = "Fady";
        employee3.salary = 115000;

        System.out.println(employee1.name+" : "+employee1.salary);
        System.out.println(employee2.name+" : "+employee2.salary);
        System.out.println(employee3.name+" : "+employee3.salary);
        //the last one will be printed out because
        // we use static in constructor// if we remove static then all names will be printed
        //the same situation with salary

        System.out.println(employee1.isHuman);

    }

}
