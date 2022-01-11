package day10_NestedIf;

public class GradeReport {

    public static void main(String[] args) {

        int score = 120;

        if (score >= 0 && score <= 100) {//if score is valid, 5 possiblities

            if (score >= 90) { // does not nessesarily to put <= 100 because we put this above
                System.out.println("exc");
            } else if (score >= 80) {;
                System.out.println("grt");
            } else if (score >= 70){ ;
                System.out.println("good");
            } else if (score >= 60){;
                System.out.println("pass");
            } else {
                System.out.println("Failed");
            }
        } else { //if score is not valid
            System.out.println("Invalid");
        }
        System.out.println("______________________________________");

        String result = ""; // temporary put empty quotes to avoid compile error

        // in this case you just assign "result = ("Failed");" and at the end  "System.out.println("result");"

        int score2 = 120;

        if (score2 >= 0 && score2 <= 100) {//if score is valid, 5 possiblities

            if (score2 >= 90) { // does not nessesarily to put <= 100 because we put this above
                result = "exc";
            } else if (score2 >= 80) {;
                result ="grt";
            } else if (score2 >= 70){ ;
                result ="good";
            } else if (score2 >= 60){;
                result ="pass";
            } else {
                result ="Failed";
            }
        } else { //if score is not valid
            result ="Invalid";
        }

        System.out.println(result);



    }
}

/*
90~100 - excellent
80~89 - great
70~79 - Good
60~69 - passed
0~59 - failed
 */