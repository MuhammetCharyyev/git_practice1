package day08_IfStatement;

import java.sql.DataTruncation;

public class LogicalOperators {

    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";
        boolean eligibility = age >=18 && citizen == "USA";
        // if add && then if one is false the both false at the output

        System.out.println(name + " eligible to vote: " + eligibility);

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean eligibleLoan = creditScore >=700 && age2 >=21 && income >=60000;

        System.out.println(name2 +" is elegible for loan: " + eligibleLoan);

        System.out.println("-------------------------------");

        String name3 = "Shay";
        int age3 = 17;
        char gender = 'M';

        boolean isEligible = age3 >=18 && (gender == 'M' || gender == 'F');

        System.out.println(name3 + " is eligible to register: " + isEligible);

        System.out.println("-------------------------------");

        String name4 = "Muha";
        int yearsOfLeave = 5;
        String countryOfBirth = "Turkmenistan";
        boolean marriedToUsCitizen = false;

        boolean eligibilityUsCitizen = yearsOfLeave >= 5 || countryOfBirth == "USA" || marriedToUsCitizen == true;

        System.out.println(name4 + " is eligible to become US citizen: " + eligibilityUsCitizen);

        System.out.println("-------------------------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;

        boolean eligiblityScholarship = gpa >=3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + eligiblityScholarship);

        System.out.println("-------------------------------");

        boolean result = true;

        boolean result2 = !result;

        System.out.println("result2 = " + result2);

        System.out.println("-------------------------------");

        int score = 55;
        boolean pass = score >=60;
        boolean failed = !pass;

        System.out.println("pass = " + pass);
        System.out.println("failed = " + failed);




    }
}
