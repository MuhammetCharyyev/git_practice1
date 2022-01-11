package day07_Operators;

public class RelationalOperators {

    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1 = 20 > 40; // false

        System.out.println("result1 = " + result1);

        boolean result2 = 300 >=150; // true

        System.out.println("result2 = " + result2);

        boolean result3 = 100 >=100; // true
        System.out.println("result3 = " + result3);

        boolean result4 = 300 >=500; //false
        System.out.println("result4 = " + result4);

        //credit score = 720

        int creditScore = 745;

        boolean eligibility = creditScore >=720;

        System.out.println("eligibility = " + eligibility);

        boolean result5 = 300 < 500; //true
        System.out.println("result5 = " + result5);

        boolean result6 = 200 <=100; //false
        System.out.println("result6 = " + result6);

        int score = 59;
        boolean hasFailed = score <=59; //true
        // 75 <=59 // false
        System.out.println("hasFailed = " + hasFailed);

        int x = 100;
        int y = 200;

        boolean equal = x==y; //false

        System.out.println("equal = " + equal);

        boolean result8 = "Muhtar" == "Good Guy"; //false

        System.out.println("result8 = " + result8);

        boolean result9 = 'A' == 'a'; //false
        System.out.println("result9 = " + result9);

        boolean result10 = "Java" == "Java"; //true
        System.out.println("result10 = " + result10);

        //even space is considered as symbol, should be completely equal to each other

        boolean result11 = 100 != 200; // true
        System.out.println("result11 = " + result11);

        boolean result12 = 300 != 300; // false
        System.out.println("result12 = " + result12);










    }

}
