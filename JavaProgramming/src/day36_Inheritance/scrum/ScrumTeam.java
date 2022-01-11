package day36_Inheritance.scrum;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

    //Attributes:
    public ProductOwner PO;
    public BusinessAnalyst BA;
    public ScrumMaster SM;
    public ArrayList<day36_Inheritance.scrum.Tester> testersList = new ArrayList<>();
    //list from Tester class
    public ArrayList<day36_Inheritance.scrum.Developer> devopsList = new ArrayList<>();
    //list from Developer class


    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
    }


    //addTester(Tester tester): adds the given tester to the testers ArrayList
    //addTesters(Tester[] testers): adds the given testers to the testers ArrayList
    public  void addTester(day36_Inheritance.scrum.Tester tester){
        testersList.add(tester); //add one by one tester to ArrList of testers
    }
    public  void addTesters(Tester[]testers){
        this.testersList.addAll(Arrays.asList(testers)); //add all testers to ArrList of testers
    }

    //addDeveloper(Developer developer): adds the given developer to the developers ArrayList
//addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
    public  void addDeveloper(day36_Inheritance.scrum.Developer developer){
        devopsList.add(developer); //add one by one developer to ArrList of testers
    }
    public  void addDevelopers(Developer[]developers){
        this.devopsList.addAll(Arrays.asList(developers)); //add all testers to ArrList of testers
    }

    //removeTester(long employeeID): removes the given tester from the testers ArrayList
    public void removeTester (int id){
        testersList.removeIf(p-> p.id==id);
        //removing tester from the list by the exact ID
    }

    //removeDeveloper(long employeeID): removes the developer from the developers ArrayList
    public void removeDeveloper (int id){
        devopsList.removeIf(p-> p.id==id);
        //removing developer from the list by the exact ID
    }

    public String toString() {
        return "ScrumTeam{" +
                ", PO='" + PO.name +'\'' +
                ", BA='" + BA.name +'\'' +
                ", SM='" + SM.name +'\'' +
                ", total number of testers =" + testersList.size() +
                // modified by adding "total number" and .size to have a total
                ", total number of developers =" + devopsList.size() +
                // modified by adding "total number" and .size to have a total
                '}';
    }
}
/*
Creat a class named ScrumTeam:
			Variables:
				PO (ProductOwner), BA (BusinessAnalyst), SM (ScrumMaster),
				testers (ArrayList<Testers>),  developers (ArrayList<Developers>)

			Methods:
				addTester(Tester tester): adds the given tester to testers arraylist
				ddTesters(Tester[] testers): adds the given testers to testers arraylist

removeTester(int id): removes the tester with the given id from the arraylist of tester

addDeveloper(Developer developer): adds the given developer to testers arraylist

addDeveloper(Developer[] developer): adds the given developers to testers arraylist

removeDeveloper(int id): removes the developer with the given id from the arraylist of developer

toString(): displays the BA' name, SM' name, PO' name, number of testers and number of developers


 */