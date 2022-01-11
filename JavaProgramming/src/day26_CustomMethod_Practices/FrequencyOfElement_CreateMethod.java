package day26_CustomMethod_Practices;

public class FrequencyOfElement_CreateMethod {

    public static void main(String[] args) {

        int[] arr = {1,1,2,4,4,5,8,54,7};

        int n =frequencyOfElement(arr, 4);

        System.out.println(n);

    }


    // frequency of the given int element from given array// {1,1,2,4,4,5,8,54,7}  find frequency of 4 (for examp)
    public static int frequencyOfElement (int [] array, int element){

        int count = 0;
        for (int each : array) {
            if(each==element){
                count++;
            }
        }
        return count;

    }

    // frequency of the given double element from given array
    public static double frequencyOfElement (double [] array, double element) {

        int count = 0;
        for (double each : array) {
            if (each == element) {
                count++;
            }
        }
        return count;
    }

        // frequency of the given char element from given array
        public static int frequencyOfElement(char[] array, char element){
            int count = 0;
            for (char each : array) {
                if(each == element){
                    count++;
                }
            }

            return count;
        }

        //returns the frequency of the given string from the given array
        public static int frequencyOfElement(String[] array, String element){
            int count = 0;
            for (String each : array) {
                if(each == element){
                    count++;
                }
            }

            return count;
    }

}
