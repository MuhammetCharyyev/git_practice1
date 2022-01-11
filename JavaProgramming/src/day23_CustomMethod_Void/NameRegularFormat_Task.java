package day23_CustomMethod_Void;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Locale;

public class NameRegularFormat_Task {

    public static void main(String[] args) {

regularName("cYdEo", "SCHOOL");

    }

    public static void regularName (String first, String last){

        String firstName = ""+(first.toUpperCase().charAt(0)) + (first.toLowerCase().substring(1,first.length()));
        String lastName = ""+(last.toUpperCase().charAt(0)) + (last.toLowerCase().substring(1,last.length()));

        System.out.println(firstName+ " " +lastName);

    }

}
/*
write a method that can print out the full name of a person in regular format
            ex:
               fullName("cYdEo", "SCHOOL");

                output:
                    "Cydeo School"

 */