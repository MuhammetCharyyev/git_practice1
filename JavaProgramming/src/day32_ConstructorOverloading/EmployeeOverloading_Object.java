package day32_ConstructorOverloading;

public class EmployeeOverloading_Object {

    public static void main(String[] args) {

        Employee_Overloading employee1 = new Employee_Overloading("Aaron");
        //first constructor, using only one parameter 'name'

        Employee_Overloading employee2 = new Employee_Overloading("lisa", 'F');
        //second option to indicate variables for the same constructor, added gender

        Employee_Overloading employee3 = new Employee_Overloading("Zouya", 'F', "Waiter");
//third overloaded to indicate variables for the same constructor, added jobTitle

        Employee_Overloading employee4 = new Employee_Overloading("Maya", 'F',
                "serever", 50000);
        //fourth overloaded to indicate variables for the same constructor, added salary

        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }

}
