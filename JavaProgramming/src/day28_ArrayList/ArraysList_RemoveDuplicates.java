package day28_ArrayList;

import java.util.ArrayList;

public class ArraysList_RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
// remove all duplicated elements
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(50);

        ArrayList<Integer> result = new ArrayList<>(); // need to create new ArrayList for adding
        // non dublicates

        for (Integer each : list) {
            if (result.contains(each)) { //if it contains same element then skip
                continue;
            }
            result.add(each); // if not contain then added to result

        }
        System.out.println(result);

    }

}
