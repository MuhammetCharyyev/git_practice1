package day10_NestedIf;

public class GreadeScore2 {

    public static void main(String[] args) {

        int score = 10;

        String result = (score >= 0 && score <= 100)? (score >= 90)? "exc" :(score >= 80)? "grt" :(score >= 70)?"good"
                :(score >= 60)?"pass" : "Failed" : "Invalid";

        System.out.println(result);

        System.out.println("-------------------------------------------");
        // solution3:

        int s = 10;
        String result2 = "";

        if (s >= 0 && s <= 100) { // if the s is valid (0 ~ 100 )

            result2 = (s >= 90) ? "Excellent" : (s >= 80) ? "Great" : (s >= 70) ? "Good" : (s >= 60) ? "Passed" : "Failed";

        } else { // if the s is NOT valid
            result2 = "Invalid Score";
        }

        System.out.println(result2);


    }
}
