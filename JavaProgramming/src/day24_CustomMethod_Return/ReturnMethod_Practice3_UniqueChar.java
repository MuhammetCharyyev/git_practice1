package day24_CustomMethod_Return;

public class ReturnMethod_Practice3_UniqueChar {

    public static void main(String[] args) {

        String str = "aabccdee";

        for (int i = 0; i < str.length(); i++) {
            int frequency = frequency(str, str.charAt(i));
            if(frequency==1){ // find if char is unique in the string
                System.out.println(str.charAt(i));
            }
        }
    }

    public static int frequency (String str, char ch) {

        int count = 0;

        for (char each : str.toCharArray()) {

            if(each==ch){
                count++;
            }

        }
        return count;

    }

}
