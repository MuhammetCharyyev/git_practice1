package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {

        Scanner calc = new Scanner(System.in);

        System.out.println("enter your hourly rate");
        double hourlyRate = calc.nextDouble();

        calc.nextLine();

        System.out.println("enter hors your worked this week");
        int hoursWeek = calc.nextInt();

        calc.nextLine();

        System.out.println("enter state tax in %");
        double stateTax = calc.nextDouble();

        calc.nextLine();

        System.out.println("enter federal tax in %");
        double fedTax = calc.nextDouble();

        double salary = hourlyRate * hoursWeek;
        double stateTaxSize = salary * stateTax/100;
        double fedTaxSize = salary * fedTax/100;
        double totalTax = stateTaxSize + fedTaxSize;
        double netIncome = salary - totalTax;

        System.out.println("salary = " + salary);
        System.out.println("stateTaxSize = " + stateTaxSize);
        System.out.println("fedTaxSize = " + fedTaxSize);
        System.out.println("totalTax = " + totalTax);
        System.out.println("netIncome = " + netIncome);

        calc.close();

/*
SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 sateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
 */
    }
}
