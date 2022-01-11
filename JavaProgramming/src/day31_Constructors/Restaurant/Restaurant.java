package day31_Constructors.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {
// Attributes:
//Owner (String), Location (String), numberOfStars (int)
//Servers (ArrayList of Server objects)
//Chefs (ArrayList of Chef objects)

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> serversList = new ArrayList<>();
    public ArrayList<Chef> chefsList = new ArrayList<>();
//Add a constructor that sets the owner, location, and number of stars.
    public Restaurant(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }
//Actions: (all void methods)
//hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
//hireServer(Server [] servers): accepts an array of Server objects and adds all of them
// to the Servers ArrayList
    public  void hireServer(Server server){
       serversList.add(server); //add one by one server to ArrList of servers
    }
    public  void hireServers(Server [] servers){
       serversList.addAll(Arrays.asList(servers)); //add all servers to ArrList of servers
    }
//hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
//hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them
//to the Chef ArrayList
    public  void hireChef(Chef chef){
        chefsList.add(chef); //add one by one chef to ArrList of chefs
    }
    public  void hireChefs(Chef [] chefs){
        chefsList.addAll(Arrays.asList(chefs)); //add all servers to ArrList of servers
    }
 //terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
 public void terminateChef (int employeeID){
     chefsList.removeIf(p-> p.employeeID==employeeID);
     //removing chef from the list by the exact ID
 }
//terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server
public void terminateServer (int employeeID){
    serversList.removeIf(p-> p.employeeID==employeeID);
    //removing server from the list by the exact ID
}

//toString(): Return (String) of all the information of a Restaurant object.
//No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs
//along side the other information

    public String toString() {
        return "Restaurant{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", total number of servers =" + serversList.size() +
                ", total number of shefs =" + chefsList.size() +
                '}';
    }


}
/*
Create a class called Restaurant
 Attributes:
Owner (String), Location (String), numberOfStars (int)
Servers (ArrayList of Server objects)
Chefs (ArrayList of Chef objects)

Add a constructor that sets the owner, location, and number of stars.

Actions: (all void methods)
hireServer(Server server): accepts a server object and adds it to the Servers ArrayList
hireServer(Server [] servers): accepts an array of Server objects and adds all of them
 to the Servers ArrayList
hireChef(Chef chef): accepts a chef object and adds it to the Chefs ArrayList
hireChef(Chef [] chefs): accepts an array of Chef objects and adds all of them
to the Chef ArrayList
terminateChef(int employeeID): removes the chef with the matching ID from the arraylist of chef
terminateServer(int employeeID) removes the server with the matching ID from the arraylist of server
toString(): Return (String) of all the information of a Restaurant object.
No need to print the whole list of Servers or Chefs. Print the number of Servers and Chefs
along side the other information

 */