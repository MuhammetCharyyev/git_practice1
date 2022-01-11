package day24_CustomMethod_Return;

public class WarmUpClass {

    public static void main(String[] args) {


        displayInitials("Muhammet", "Charyyev");

        System.out.println("__________________________________");

        domain("sybir@gmail.com");

        System.out.println("__________________________________");

        String [] emails = {"josh@gmail.com", "jim@yahoo.com", "elnur@cydeo.com", "gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }
        System.out.println("__________________________________");

        nameMonth(2);
        System.out.println("__________________________________");

        nameDay(4);


    }
    //1. Create a method that can display the initials of the person
    public static void displayInitials (String firstName, String lastName){

        String initials = ""+ (firstName.toUpperCase().charAt(0)) + "."+ (lastName.toUpperCase().charAt(0))+".";

        System.out.print(initials);

        System.out.println();

    }

    //2. Create a method that can display the domain of the email

    public static void domain (String email){

        String domain = email.substring(email.indexOf("@")+1 , email.lastIndexOf("."));
        System.out.println("domain = " + domain);



    }

  //3. Create a method that can display the name of the month based on the given number to the method

 public static void nameMonth (int number){

        String month = "";

        if(number>=1 && number<=12){

            month = (number==1)? "Jan" :(number==2)? "Feb" :(number==3)? "Mar" : (number==4)? "Apr"
                    : (number==5)? "May" :(number==6)? "Jun" : (number==7)? "Jul" :(number==8)? "Aug"
                    :(number==9)? "Sep" : (number==10)? "Oct" :(number==11)? "Nov" :"Dec";

        }else{
            month="invalid";
        }
     System.out.println(month);

    }

    //4. Create a method that can print the name of the day based on the given number to the method

    public static void nameDay (int number){

        String day = "";

        if(number>=1 && number<=7){

            day = (number==1)? "Mon" :(number==2)? "Tue" :(number==3)? "Wen" : (number==4)? "Thu"
                    : (number==5)? "Fri" :(number==6)? "Sat" : "Sun";

        }else{
            day="invalid";
        }
        System.out.println(day);

    }

    //5. Create a method that can print how many days a month has

    public static void daysInMonth (int number){



    }

}
