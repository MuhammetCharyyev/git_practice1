package day05_Concatenation;

public class PhoneNumber {

    public static void main(String[] args) {

        byte countryCode = 1;
        int areaCode = 703;
        long localNumber = 4512625;

        String phoneNumber = ("+" + countryCode + "(" + areaCode + ")" + "-" + localNumber);

        System.out.println(phoneNumber);

    }
}

/*
 create a class named Phone Number and declare the following variables:
            countryCode, areaCode, localNumber

            use string concatenation to display the phone number

            ex:
                if  countryCode = 1
                    areaCode = 703
                    localNumber = 4512625

                output:
                    +1(703)-4512625
 */