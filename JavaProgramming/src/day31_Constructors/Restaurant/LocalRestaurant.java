package day31_Constructors.Restaurant;

import day31_Constructors.scrumTask.Developer;
import day31_Constructors.scrumTask.Tester;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalRestaurant {

    public static void main(String[] args) {
//Make a Restaurant object
        Restaurant restaurant1 = new Restaurant("Muhammet Charyyev", "Chicago IL",
                5);

  //Create an array of servers with their information set.
// Add those initial servers to the ArrayList of Servers in the Restaurant object
        Server server1 = new Server();
        server1.setInfo("Ayna", 123,20,true);
        Server server2 = new Server();
        server2.setInfo("Bike", 223,20,true);
        Server server3 = new Server();
        server3.setInfo("Gulya", 133,20,false);

        Server[] servers = {server1,server2,server3};
        //restaurant1.serversList= new ArrayList<>(Arrays.asList(servers));
        restaurant1.hireServers(servers);

//Create an array of chefs with their information set.
//Add those initial chefs to the ArrayList of Chefs in the Restaurant object
       Chef chef1 = new Chef();
       chef1.setInfo("Oleg", 213, 25,true);
        Chef chef2 = new Chef();
        chef2.setInfo("Serg", 113, 23,false);
        Chef chef3 = new Chef();
        chef3.setInfo("Vita", 212, 22,true);

        Chef[] chefs = {chef1, chef2, chef3};
       // restaurant1.chefsList= new ArrayList<>(Arrays.asList(chefs));
        restaurant1.hireChefs(chefs);

        for (Server eachServer: restaurant1.serversList) {
            System.out.println(eachServer.name+" : "+eachServer.hourlyRate+", " + eachServer.isFullTime());
            // get each server from the list with salary identification
        }

        for (Chef eachChef: restaurant1.chefsList) {
            System.out.println(eachChef.name+" : "+eachChef.hourlyRate+", " + eachChef.isFullTime());
            // get each chef from the list with salary identification
        }

        restaurant1.terminateServer(123); //remove specific server by ID
        restaurant1.terminateChef(212);//remove specific chef by ID

        System.out.println(restaurant1);

    }
}
/*
Create a class LocalRestaurant that has a main method with the following:
- Make a Restaurant object
- Create an array of servers with their information set.
Add those initial servers to the ArrayList of Servers in the Restaurant object
- Create an array of chefs with their information set.
Add those initial chefs to the ArrayList of Chefs in the Restaurant object
- Print your whole restaurants information

 */