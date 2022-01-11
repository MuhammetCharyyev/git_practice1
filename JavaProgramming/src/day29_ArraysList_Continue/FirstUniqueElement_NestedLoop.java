package day29_ArraysList_Continue;

import java.util.ArrayList;

public class FirstUniqueElement_NestedLoop {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(5);
        list.add(5);

        for (Integer each : list) {

            int frequency = 0;

            for (Integer element : list) {
                if (element == each) {
                    frequency++;
                }
            }
            if(frequency==1){ // if unique element is found then break
                System.out.println(each);
                break;
            }
        }

    }

}
