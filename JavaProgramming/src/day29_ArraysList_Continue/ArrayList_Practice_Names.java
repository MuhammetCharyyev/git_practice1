package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Practice_Names {

    public static void main(String[] args) {

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "Dave", "Ahmed", "Jim", "Ahmed", "Dave"));
        //if you want to remove all except "Ahmed" and "Dave"

        employees.retainAll(Arrays.asList("Ahmed", "Dave")); // retainAll keep the selected elements
                                                             // the Arrays.asList should be called
        // because Bulk Operators such as retainAll can only accept collection type as argument

        System.out.println("employees = " + employees);
        //employees = [Dave, Ahmed, Ahmed, Dave]

        System.out.println("______________________________________________");

        String[] names = {"Mary","Mehry","Marian","Joe","Dave"};
        // remove all names with uppercase "M"
// first: convert array to ArrList to use removeIf method
        ArrayList<String> list =new ArrayList<>(Arrays.asList(names));// () insert name of string here

        list.removeIf( p-> p.charAt(0) =='M'); // condition if first element has upper 'M'
                                              // then it will be removed from the ArrList
                                             //or you can use startWith 'M' method

        names = list.toArray(new String[0]); //convert back to Array with mandatory assigning
                                           //indicate set a size in [],
                                         // by default you may set [0]
        System.out.println(Arrays.toString(names)); //[Joe, Dave]

    }

}
