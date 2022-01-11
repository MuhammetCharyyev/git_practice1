package day09_IfStatements2;

public class AgeGroups {

    public static void main(String[] args) {

        String name = "Alex";
        int age = 75;


            if (age >=1 && age<= 2){
            System.out.println(name+ ": infant (1 - 2)");
        }else if (age >=3 && age<=5){
            System.out.println(name+ ": Toddler (3 - 5)");
        }else if (age >=6 && age<=9){
            System.out.println(name+ ": Kid (6 - 9)");
        }else if (age >=10 && age<=12){
            System.out.println(name+ ": Pre-teen (10 - 12)");
        }else if (age >=13 && age<=17){
            System.out.println(name+ ": Teen (13 - 17)");
        }else if (age >=18 && age<=20){
            System.out.println(name+ ": Young adult (18 - 20)");
        }else if (age >=21 && age<=39){
            System.out.println(name+ ": Adult (21 - 39)");
        }else if (age >=40 && age<=49){
            System.out.println(name+ ": Young Middle-Aged adult (40 - 49)");
        }else if (age >=50 && age<=54){
            System.out.println(name+ ":  Middle-Aged Adult (50 - 54)");
        }else if (age >=55 && age<=64){
            System.out.println(name+ ":  Very Young Senior Citizen (55 - 64)");
        }else if (age >=65 && age<=74){
            System.out.println(name+ ":  Young Senior Citizen (65 - 74)");
        }else if (age >=75 && age<=84){
            System.out.println(name+ ":  Senior Citizen (75 - 84)");
        }else if (age >=85 ){
            System.out.println(name+ ":  Old Senior Citizen (85+)");
        }else {
            System.out.println(name+ ":  Uncategorized");

        }


    }
}


/*
Create a class called AgeGroups, and write a program that can define the age groups of a person

	             age groups are:
	                    infant (1 - 2)
	                    Toddler (3 - 5),
	                    Kid (6 - 9),
	                    Pre-Teen (10 - 12),
	                    Teenager (13 - 17),
	                    Young Adult (18 - 20),
	                    Adult (21 - 39),
	                    Young Middle-Aged Adult (40 - 49),
	                    Middle-Aged Adult (50 - 54),
	                    Very Young Senior Citizen (55 - 64),
	                    Young Senior Citizen (65 - 74),
	                    Senior Citizen (75 - 84),
	                    Old Senior Citizen (85+)
 */