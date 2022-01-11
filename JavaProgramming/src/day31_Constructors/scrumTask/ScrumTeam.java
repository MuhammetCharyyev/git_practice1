package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {
//Attributes:
    public String PO, BA, SM;
    public ArrayList<Tester> testersList = new ArrayList<>(); //list from Tester class
    public ArrayList<Developer> devopsList = new ArrayList<>(); //list from Developer class
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

   //addTester(Tester tester): adds the given tester to the testers ArrayList
   //addTesters(Tester[] testers): adds the given testers to the testers ArrayList
    public  void addTester(Tester tester){
        testersList.add(tester); //add one by one tester to ArrList of testers
    }
    public  void addTesters(Tester []testers){
        testersList.addAll(Arrays.asList(testers)); //add all testers to ArrList of testers
    }

//addDeveloper(Developer developer): adds the given developer to the developers ArrayList
//addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
    public  void addDeveloper(Developer developer){
        devopsList.add(developer); //add one by one developer to ArrList of testers
    }
    public  void addDevelopers(Developer []developers){
        devopsList.addAll(Arrays.asList(developers)); //add all testers to ArrList of testers
    }

    //removeTester(long employeeID): removes the given tester from the testers ArrayList
    public void removeTester (int employeeID){
        testersList.removeIf(p-> p.employeeID==employeeID);
                              //removing tester from the list by the exact ID
    }
//removeDeveloper(long employeeID): removes the developer from the developers ArrayList
    public void removeDeveloper (int employeeID){
        devopsList.removeIf(p-> p.employeeID==employeeID);
        //removing developer from the list by the exact ID
    }

//toString(): prints number of tester,& developers,  PO name, SM name, BA name
    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers =" + testersList.size() +
                // modified by adding "total number" and .size to have a total
                ", total number of developers =" + devopsList.size() +
                // modified by adding "total number" and .size to have a total
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
/*
create a class called ScrumTeam
	           Attributes:
	                String PO, BA, SM;
	                ArrayList<Tester> testersList = new ArrayList<>();
	                ArrayList<Developer> devopsList = new ArrayList<>();
	                int daysOfSprint;

	               Add A constructor that can set the fileds PO, BA, and SM

 Actions:
	   addTester(Tester tester): adds the given tester to the testers ArrayList
addTesters(Tester[] testers): adds the given testers to the testers ArrayList
 addDeveloper(Developer developer): adds the given developer to the developers ArrayList
addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
 removeTester(long employeeID): removes the given tester from the testers ArrayList
 removeDeveloper(long employeeID): removes the developer from the developers ArrayList
 toString(): prints number of tester,& developers,  PO name, SM name, BA name

 */