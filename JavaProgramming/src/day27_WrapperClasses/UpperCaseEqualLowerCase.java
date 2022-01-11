package day27_WrapperClasses;

import utilities.ArraysUtility;
import utilities.StringUtility;

public class UpperCaseEqualLowerCase {

    public static void main(String[] args) {

        String str = "JAVA java java";

        int upperCase = 0;
        int lowerCase = 0;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isLowerCase(str.charAt(i))){
                lowerCase++;
            }
            if(Character.isUpperCase(str.charAt(i))){
                upperCase++;
            }

        }
        boolean equal = upperCase==lowerCase;

        System.out.println(equal);



    }

}
