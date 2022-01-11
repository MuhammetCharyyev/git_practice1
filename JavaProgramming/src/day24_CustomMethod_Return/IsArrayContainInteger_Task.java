package day24_CustomMethod_Return;

public class IsArrayContainInteger_Task {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int num = 10;

        System.out.println(isContained(arr, num));

        


        //contains(arr, num) ===> false

    }

    public static boolean isContained ( int[] arr, int num){

        for (int each : arr) {
            return each == num;

        }
        return isContained(arr, num);
    }

}
/*
Create a method named contains that passes one integer array and one integer parameters,
the method returns true if the given integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */