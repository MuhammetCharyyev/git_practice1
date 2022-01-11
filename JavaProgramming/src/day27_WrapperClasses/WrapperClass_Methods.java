package day27_WrapperClasses;

import javax.security.auth.callback.CallbackHandler;
import javax.sound.midi.Soundbank;

public class WrapperClass_Methods {

    public static void main(String[] args) {

        String str = "123456";

        int num = Integer.parseInt(str) ; // parse method allows to convert String to primitive, (int) in this case

        System.out.println(num+1); // doing the adding to the number

        System.out.println(str+1); // doing adding to the string

        String str2 = "12.6";

        double num2 = Double.parseDouble(str2); // return should be double

        System.out.println(num2+1);

        int max = Integer.MAX_VALUE; // show you the max integer value
        int min = Integer.MIN_VALUE; // show you the min integer value
        // you can also admit this to any primitive, Double.MAX_VALUE for example

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;


        System.out.println("max = " + max); // show you the max long value
        System.out.println("min = " + min); // show you the min long value

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        System.out.println("_____________________________________________________");

        String s1 = "true"; // if you enter "maybe" for ex, by default it will be converted to false

        boolean r1=Boolean.parseBoolean(s1); // convert string to boolean

        System.out.println("r1 = " + r1);

        System.out.println("_____________________________________________________");

        String s2 = "1234"; // want to convert to Integer class

       Integer x = Integer.valueOf(s2); // returns to Integer class

        int y = Integer.valueOf(x); //convert Integer class to primitive

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        String s3 = "1.54"; // want to convert to Double class

        Double z = Double.valueOf(s3); // returns to Double class
        double a = Double.valueOf(z); //convert Double class to primitive

        System.out.println("z = " + z);
        System.out.println("a = " + a);

        System.out.println("_____________________________________________________");

        //isDigit()
        char ch1 = '!';

        boolean r2=Character.isDigit(ch1); // show if the given char is digit or not // true or false

        System.out.println("r2 = " + r2);

        //isLetter()
        boolean r3=Character.isLetter(ch1); // show if the given char is letter or not // true or false

        System.out.println("r3 = " + r3);

        // special char isLetterOrDigit()
        boolean r4 = !Character.isLetterOrDigit(ch1); // show if the given char is letter or digit or not
        // true or false

        System.out.println("r4 = " + r4);

        //upperCase or lowerCase()

        boolean r5 = Character.isUpperCase(ch1);  // show if the given char is letter with upper case or not
        // true or false


        boolean r6 = Character.isLowerCase(ch1);  // show if the given char is letter with lower case or not
        // true or false

        System.out.println(r5);
        System.out.println(r6);

        System.out.println("_____________________________________________________");

        String s = "ab1sde2efg4hi3"; // find sum of digits

        int sum = 0;

        for (char each : s.toCharArray()){
            if(Character.isDigit(each)){
                sum+=Integer.parseInt("" + each); // "" convert char to string
            }
        }

        System.out.println(sum);



    }

}
