package day21_Arrays_For_Each_Loop;

public class UniqueElement_ForEachLoop {

    public static void main(String[] args) {

        String[] words = {"Layan", "Alexander", "Olga", "Adam", "Adam", "Cihad", "Layan"};
        // check and find the particular string


        for (String each : words) { // each represents each of elements

            int count = 0;

            for (String element : words) {
                if (element.equals(each)) { // for particular string ==> element.equals("StringName")
                    count++;
                }
            }
            // what if I want to repeat checking for each name? you need nested for each loop
            if(count ==1){
                System.out.println(each);
            }

        }





    }

}
