package OfficeHours;

import java.util.ArrayList;

public class HidePassword {

    public static void main(String[] args) {
        String[] password = {"one", "hi", "hold"};

        ArrayList<String> hiddenPassword = new ArrayList<>();

        for (String each : password) {
            hiddenPassword.add(convertToStar(each));
        }

        System.out.println(hiddenPassword);
    }

    public static String convertToStar (String str){
        String star = "";

        for (int i = 0; i < str.length(); i++) {
            star+="*"; //adding star istead of each letter
        }

        return star;
    }

}
/*  (HidePassword)

                 Task 2 : Hide Passwords

 Given an array of passwords (String). Hide each password as a star () and show the hidden password

                    Ex:

                    Input:
                    {"one", "hi", "hold}

                    Output:
                    [ **, , ** ]

                */