package OfficeHours;

import java.util.Arrays;

public class RemoveSpacesMiddle {

    public static void main(String[] args) {
        String input = "  Hello world      I      love      Java    ";
        removeSpaces(input);
    }

    public static void removeSpaces(String str) {

        String result = "";

        String[] strArr = str.trim().split(" "); //trim by sides and then split till spaces

        for (String each : strArr) {
            if (!each.isEmpty()) { // if each element is not empty then add to the 'result'
                result += each + " ";// adding each element plus space between elements

            }
        }
        System.out.println(result.trim());
        // trim() is removing space at the end -> 'Hello world I love Java'
    }
}

/*  (RemoveSpaces)

                      Task 3 :   Write a method that can remove  all extra space from String


                            Input: "  Hello world      I      love      Java    "
                           Output: Hello world I love Java

 */