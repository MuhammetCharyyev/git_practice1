package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_ReplaceRemoveContainClearAddAll {

    public static void main(String[] args) {
// want to replace each element by new one with increasing in 2 times
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i)*2); // get each index and replace by element with multiplication by 2
        }
        System.out.println(list);

        System.out.println("____________________________________________________________");

        ArrayList<String> employees = new ArrayList<>();
        //want to remove one element
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Neira");
        employees.add("Ali");
        employees.add("Huliya");
        employees.add("Kaloyan");

// do not use remove method inside the loop
        // use "remove if" method instead
        employees.remove(1); // remove by index, then you have to indicate int
        employees.remove(1);// if you remove elements off the array list
                                  // then you increase index one by one to the left side

        System.out.println(employees); //[Suat, Ali, Huliya, Kaloyan]

        employees.remove(employees.size()-1); // to remove the last index

        System.out.println(employees); //[Suat, Ali, Huliya]

        boolean r1 =employees.remove("Huliya"); // remove by indication exact string object
                                                  // remove object returns to boolean
                                                 //  only concerns to non-primitive

        System.out.println(employees); //[Suat, Ali]
        System.out.println(r1);

        System.out.println("____________________________________________________________");

        ArrayList<Character> chars = new ArrayList<>();
// get first matching element from the beginning and end of list
        chars.add('A');
        chars.add('A');
        chars.add('A');
        chars.add('A');
        chars.add('A');
        chars.add('A');

        int a =chars.indexOf('A'); //first index , => 0
        int b = chars.lastIndexOf('A'); // last matching index => length()-1

        System.out.println(a);
        System.out.println(b);

        System.out.println("____________________________________________________________");
        //find if char contain element
        boolean r2= chars.contains('A'); // returns to boolean // true
        boolean r3 = chars.contains('Z'); // returns false

        System.out.println(r2);
        System.out.println(r3);

        System.out.println("____________________________________________________________");

        ArrayList<Integer> list1 = new ArrayList<>();
// check if equals
        list.add(100);
        list.add(100);
        list.add(100);

        ArrayList<Integer> list2 = new ArrayList<>(); // different object in a heap
                                                     // that is why == method is not suitable then
        list.add(100);
        list.add(100);
        list.add(100);

        System.out.println(list1.equals(list2)); // method to find equals between 2 new array lists

        System.out.println("____________________________________________________________");

        boolean r4=list1.isEmpty(); // as it is boolean then =>false

        //what if to clean all elements
        list1.clear();

        System.out.println(r4); // then true

        System.out.println("____________________________________________________________");

        ArrayList<Integer> numbers = new ArrayList<>();
// add all  elements // Bulk Operation // CollectionType

        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7)); //collection type

        System.out.println(numbers);


    }
}
