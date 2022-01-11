package day28_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods_RemoveClear {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
// want remove by index or by object itself
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

       /*
        int num =1;
        list.remove(1); // or list.remove(num)
        */

        // or by object

        Integer num = 200;

        boolean r=list.remove(num); // remove the object from array list
                                   // as it is non-primitive then returns to boolean

        System.out.println(list);
        System.out.println(r);

        System.out.println("____________________________________________________________");

        //if we need to remove everything

        System.out.println(list.size()); // 6 indexes

        list.clear(); // remove all elements from array list

        System.out.println(list.size()); //0 indexes

        System.out.println(list); // empty [] at the end


    }

}
