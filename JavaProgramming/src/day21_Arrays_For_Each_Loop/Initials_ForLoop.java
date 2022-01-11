package day21_Arrays_For_Each_Loop;

public class Initials_ForLoop {

    public static void main(String[] args) {

        String[] names = {"Jeff Bezos", "Elon Musk", "Bernard Arnault", "Bill Gates", "Pavel Durov"};

        for (String each : names) {
            String initials = each.charAt(0) + "."+each.charAt(each.indexOf(" ")+1); // initials of first name
            System.out.println(initials);
        }

    }


}
