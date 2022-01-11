package day14_StringClass2;

public class EmailDomain_Substring {

    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        int beginningIndex = email.indexOf("@")+1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println("domain = " + domain);

        System.out.println("_______________________");

        String str1 = "Java is fun, Java is cool";
        //             012345678910
        //

        String str2 = str1.substring(0, 10+1); // "Java is fun"
        String str3 = str1.substring(str1.lastIndexOf("J")); // "Java is cool"


        String str4 = "Java is fun, Java is cool, I love Java";
        String str5 = str4.substring(str4.indexOf(" I")+1);

        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str5);



    }
}
