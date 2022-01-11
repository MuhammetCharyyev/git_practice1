package day08_IfStatement;

public class GradeReport {

    public static void main(String[] args) {

        int score = 100;

        boolean excellent = score >=90 && score <= 100;
        boolean great = score >=80 && score < 90; //or just !excellent
        boolean good = score >=70 && score < 80; //or just !great &&!excellent
        boolean passed = score >=60 && score < 70; //or just !good &&!great&& !excellent
        boolean failed = score >=0 && score < 60; //or just !passed&&!good&& !great&& !excellent

        if(excellent){
            System.out.println("Excellent");
        }
        if (great){
            System.out.println("Great");
        }
        if (good){
            System.out.println("Good");
        }
        if (passed){
            System.out.println("Passed");
        }
        if (failed){
            System.out.println("Failed");
        }


    }
}
/*

 */

