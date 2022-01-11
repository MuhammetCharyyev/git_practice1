package day10_NestedIf;

public class NestedIfIntro {

    public static void main(String[] args) {

        int score = 1000;

        if (score >= 0 && score <= 100) {//if score is valid

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else { //if score is not valid
            System.out.println("Invalid");


        }

        System.out.println("______________________________________");

        int age = 5;
        boolean hasID = true;

        if (hasID) {//if person has ID

            if (age >= 21) { // if the person is 21 old or older
                System.out.println("Eligible");
            } else { //if person less 21 old
                System.out.println("Not Eligible");
            }
        } else { //if does not have ID
            System.out.println("You must have ID");

        }

        System.out.println("______________________________________");

        int number = 0;

        if (number >= 1 && number <= 7) {//if number is valid (1~7)

            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {;
                System.out.println("Tue");
            } else if (number == 3) {;
                System.out.println("Wen");
            }else if(number ==4){;
                System.out.println("Thu");
            }else if(number==5){;
                 System.out.println("Fri");
            }else if(number==6){;
                 System.out.println("Sat");
            }else{
                 System.out.println("Sun");
        }
        }else{ //if number is not valid
        System.out.println("Invalid");

        }


        }

        }
