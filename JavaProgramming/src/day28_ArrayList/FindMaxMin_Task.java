package day28_ArrayList;

import java.util.ArrayList;

public class FindMaxMin_Task {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int result = 0;

        int max = list.get(0);
        int min =list.get(0);

        for (Integer each : list) {
            if (each > max){
                max = each;
            }
            if (each < min){
                min = each;
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

}
/*
 Write a program that can find the maximum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				5
Write a program that can find the minimum number from an ArrayList of integers
		Ex:
			list = [1,2,3,4,5];
			output:
				1
 */
