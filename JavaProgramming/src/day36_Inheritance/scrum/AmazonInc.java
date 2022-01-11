package day36_Inheritance.scrum;

public class AmazonInc {

    public static void main(String[] args) {

        String company = "Amazon Inc";

       ProductOwner po = new ProductOwner("Dave", 26, 'm', 1,  company, 120000);


        Tester tester1=new Tester("Chinara",32,'F',1415,company,"QA", 120000);

        Tester tester2=new Tester("Yasaman",31,'F',1416,company,"QA", 110000);

        Tester tester3=new Tester("Irena",29,'F',1417,company,"QA", 120000);

        Tester tester4=new Tester("Cihad",26,'M',1418,company,"QA", 130000);
        Tester[] testers={tester1,tester2,tester3,tester4};



        Developer developer1=new Developer("Mia",32,'F',1415,company,"Dev", 120000);

        Developer developer2=new Developer("Olga",31,'F',1416,company,"Dev", 110000);

        Developer developer3=new Developer("Sua",29,'F',1417,company,"Dev", 120000);

        Developer developer4=new Developer("Mor",26,'M',1418,company,"Dev", 130000);
        Developer[] developers={developer1,developer2,developer3,developer4};






    }


}
/*
Create a class named AmazonInc:
create the objects of ProductOwner, ScrumMaster, and BusinessAnalyst
Create 4 objects of Testers
Create 5 Objects of Developers
Create an object of ScrumTeam
Add the ProductOwner, ScrumMaster, and BusinessAnalyst, Testers and Developers
object into the scrum team
 */