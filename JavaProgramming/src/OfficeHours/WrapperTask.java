package OfficeHours;

public class WrapperTask {

    public static void main(String[] args) {
        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";
        //remove all unnecessary letters and symbols to get "Welcome To Core Java"
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {// check if each char is upper case
                result += " "; // if yes then added to result and split by space
            }
            if (Character.isAlphabetic(str.charAt(i))) {// check if each char is alphabetic
                result += str.charAt(i); // if yes then add to result
            }
        }
        System.out.println(result.trim()); //trim is removing spaces at sides

    }

}
/*   (WraperTask)

                   Task :

                        String str = "(((W&e**_lco73me %T%o Co!@$,,<r>e <J>>>$@av^453a";

                        Write a method that returns : Welcome To Core Java

                */