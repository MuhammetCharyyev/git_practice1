package day24_CustomMethod_Return;

public class AvengersClass_EncryptPassword {

    /*
     *  5.
     *                 Given a string password. Encrypt with "x" a given password
     *                 and print.
     *                 (do with for loop)
     *                 password: cydeo
     *                 encrypt with char :x
     *                 output:cxyxdxexox
     */

    public static void main(String[] args) {

        String password = "cydeo";
        char encrypt = 'x';
        String encryptPassword = "";

        for (int i = 0; i < password.length(); i++) {
            encryptPassword += ""+ password.charAt(i)+encrypt;
        }
        System.out.println("encryptPassword = " + encryptPassword);

    }

}
