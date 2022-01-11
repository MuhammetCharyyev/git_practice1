package day28_ArrayList;

import java.util.ArrayList;

public class ArraysList_UniqueElement {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        // find unique element
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C#");
        list.add("C#");
        list.add("Ruby");
        list.add("C++");
        list.add("C++");

        ArrayList<String> unique = new ArrayList<>();

        for (String each : list) {
            if(list.indexOf(each) == list.lastIndexOf(each)){ //find the unique element
                // if index from the beginning and from the end are the same =>unique
                unique.add(each);
            }
        }
        System.out.println(unique);
    }

}
