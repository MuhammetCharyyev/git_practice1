package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_RemoveRetainContainConvert {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,3,8,5));
                                        // asList method allows to add list of elements
        
        //if I want to remove some elements
        
        list.removeAll(Arrays.asList(3,5,8)); // call asList then indicate elements to remove
                                         // allows to remove even duplicated elements

        System.out.println("list = " + list);

        System.out.println("______________________________________________");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200, 300,400,500,600,700,800));

        numbers.retainAll(Arrays.asList(100,200,300)); // retainAll keeps selected elements
                                                     // others will be removed

        System.out.println(numbers);

        System.out.println("______________________________________________");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA", "SDET","Developer","Scrum Master", "QA",
                "SDET","BA","BA")); // want to remove excess

        jobTitles.retainAll(Arrays.asList("QA", "SDET")); // all others will be removed

        System.out.println("jobTitles = " + jobTitles);

        System.out.println("______________________________________________");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9));

        boolean r1 = nums.contains(10); // returns true or false if one element is in ArrList

        boolean r2 = nums.containsAll(Arrays.asList (9, 5)); // allows to indicate several
                                                            // elements that need to be checked if
                                                           // they are contained into the ArrList

        System.out.println("r2 = " + r2);

        System.out.println("______________________________________________");

        String[] names = {"josh", "john", "aisha", "dan", "muha"}; //want to convert to ArrList

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));
                                     // allows to convert Array to ArrayList
       // nameList.addAll(Arrays.asList(names)); // 2nd option to convert Array to ArrayList

        System.out.println("nameList = " + nameList);

        System.out.println("______________________________________________");



        Integer[] arr = {1,2,3,4,5,6,7,8,9,10};

        ArrayList<Integer> list2 = new ArrayList<>( Arrays.asList(arr));

        System.out.println(list2);
        System.out.println("------------------------------------------------------");

        int[] arr2 ={1,2,3,4,5,6,7,8};

        ArrayList<Integer> list3 = new ArrayList<>(convertArraytoArrayList(arr2));
                                 // concerns to the method we created below
        System.out.println("list3 = " + list3);
    }

    // we can also to creat a method to convert Array to ArrayList

    public static ArrayList<Integer> convertArraytoArrayList (int[]array) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }
        return list;
    }

}
