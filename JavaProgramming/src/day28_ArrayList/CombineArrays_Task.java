package day28_ArrayList;

import java.util.ArrayList;

public class CombineArrays_Task {

    public static void main(String[] args) {

        ArrayList<String>  arr1 =  new ArrayList<>();
        ArrayList<String>  arr2 =  new ArrayList<>();

        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr2.add("D");
        arr2.add("E");
        arr2.add("F");
        arr2.add("G");

        for (int i = 0; i < arr2.size(); i++) {
            String arr3= arr2.get(i);
            arr1.add(arr3);
        }


        System.out.println(arr1);
    }
}
   /* write a program that can combine two String arrays into one arrayList
	            ex:
                        arr1 = {"A", "B", "C"};
                        arr2 = {"D", "E", "F", "G"};
                        list ==> {"A", "B", "C", "D", "E", "F", "G"}

    */