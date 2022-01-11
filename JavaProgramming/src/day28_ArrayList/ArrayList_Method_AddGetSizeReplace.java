package day28_ArrayList;

import java.util.ArrayList;

public class ArrayList_Method_AddGetSizeReplace {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Muhammet"); // add to the list new element, you can add as many as you want

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10); // converting primitive to Wrapper Class - autoboxing
        numbers.add(20); // index1
        numbers.add(30); // index2
        numbers.add(40); // index3
        numbers.add(50); // index4
        // new data will be added after the last index

        // you can also insert to the dedicated place by add (index, element):
        numbers.add(2, 25); // inserted to index 2 all others will be shifted on one index
        numbers.add(5,45);

        System.out.println("students = " + students);
        System.out.println("numbers = " + numbers);

        System.out.println("____________________________________________________________");

        int lastIndex =  numbers.size()-1;

        System.out.println( lastIndex); // find size of the array list, indexes

        System.out.println("____________________________________________________________");

       int num= numbers.get(3); // get the element data by indicating exact index

        System.out.println(num);

        System.out.println("____________________________________________________________");

        for (int i = 0; i < numbers.size(); i++) { // .size() is length of array list
            System.out.println(numbers.get(i)); // print out all elements from array list

        }

        System.out.println("____________________________________________________________");

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java"); // want to replace by Java Script
        list.add("C#"); // want to replace by C++
        list.add("Ruby");

        list.set(2,"Java Script"); // similar to replace method// replace the given index by new element
        list.set(3, "C++");

        System.out.println(list);



    }

}
