package day21_Arrays_For_Each_Loop;

public class CommonElements_TwoArrays {

    public static void main(String[] args) {

        int[] arr1= {1,2,3,4,5};
        int[] arr2 = {4,5,6,7,8};
        
        int common =0;
        

        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    common+=arr1[i];
                            common+=arr2[j];

                }
            }System.out.print(common);
        }

           // System.out.println(common);

    }

}
/*
Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
 */
