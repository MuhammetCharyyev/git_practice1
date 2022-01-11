package day36_Inheritance.phoneTask;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iPhone = new Iphone( "Iphone12", "Big",
                1000, "white");

        System.out.println(iPhone);
        iPhone.call(1234121234235L);
        iPhone.text(1232314124124L);
        iPhone.faceTime(21343564734L);
        iPhone.faceTime("dfsgdsjks");


        Samsung samsung = new Samsung("S21", "long", 1000, "gold");
        System.out.println(samsung);

        samsung.call(1213124324324L);
        samsung.freeze();

        Nokia nokia = new Nokia("13", "mid", 20, "blue");
        System.out.println(nokia);

        nokia.selfDefense();





    }

}
