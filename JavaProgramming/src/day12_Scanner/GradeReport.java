package day12_Scanner;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner report = new Scanner(System.in);

        System.out.println("Enter your score:");
        int score = report.nextInt();
        String result = "";

        if (score >=0 && score <=100) {
            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score>= 60)?
                    "D" : "E";

        } else {
            result = "Invalid Score";
        }

        System.out.println(result);


/*
GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
 */

    }
}
