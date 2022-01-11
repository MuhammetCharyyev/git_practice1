package day07_Operators;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 50,
            weeklyHours = 45;
        double givenStateTax = 0.06,
               givenFederalTax = 0.26;

        int salaryBeforeTaxes = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTaxes * givenStateTax;
        double federalTax = salaryBeforeTaxes* givenFederalTax;
        double totalTaxes = stateTax + federalTax;
        double salaryAfterTaxes = salaryBeforeTaxes - totalTaxes;

        System.out.println("Gross pay is: $" + salaryBeforeTaxes);
        System.out.println("State Tax: $" + stateTax);
        System.out.println("Federal Tax: $" + federalTax);
        System.out.println("Total Taxes: $" + totalTaxes);
        System.out.println("Net Income: $" + salaryAfterTaxes);



    }

}

/*
declare the following variables:
					hourlyRate, weeklyHours, stateTax, federalTax

			 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)

				    output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560

 */
