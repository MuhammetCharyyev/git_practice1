package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffersObjects_WarmUpTask {

    public static void main(String[] args) {

        Offer_WarmUpTask offer1 = new Offer_WarmUpTask(); // objects from Offer_WarmUpTask class
        offer1.setInfo("VA", "Amazon", "SDET", 110000,
                       true, true, true, true);

        Offer_WarmUpTask offer2 = new Offer_WarmUpTask();
        offer2.setInfo("CA", "Sony", "QA", 120000, true,
                       false, false, true);

        Offer_WarmUpTask offer3 = new Offer_WarmUpTask();
        offer3.setInfo("FL", "Apple", "QE", 125000, true,
                true, true, false);

        Offer_WarmUpTask offer4 = new Offer_WarmUpTask();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000,
                false, false, true, true);

        Offer_WarmUpTask offer5 = new Offer_WarmUpTask();
        offer5.setInfo("WA", "BOA", "BA", 130000, true,
                true, false, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        //Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        // 2.3.1 Write a program that can remove the offer objects that are not full-time

        Offer_WarmUpTask[] myOffer = {offer1, offer2, offer3, offer4, offer5};
                                     //collection of all offers in one Array

        ArrayList<Offer_WarmUpTask> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffer));
        // convert array to ArrList
        fullTimeOffers.removeIf(p-> !p.hasFullTime); //remove all that have not full time from the ArrList

        System.out.println(fullTimeOffers.size());// show how many offers does have full time


//2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
//      2.4.1 Write a program that can remove all the offers that are not from local
        ArrayList<Offer_WarmUpTask> localOffers = new ArrayList<>(Arrays.asList(myOffer));
        // convert array to ArrList
        localOffers.removeIf(p-> !(p.location.equals("VA") || p.location.equals("CA")) );
                                          // if it is not "VA" or "CA" then remove from list
                                         // you have to put '!' before '(' for 2 or more parameters
        System.out.println(localOffers.size());// show how many offers from VA or CA

        for (Offer_WarmUpTask localOffer : localOffers) { //to show local companies and salary
            System.out.println(localOffer.companyName + " : " +localOffer.salary);
        }


    }



}
/*
 2. Create a class named MyOffers:

 2.1 Create 7 objects of Offer
 2.2 Create an array of Offers named myOffers and store all 7 objects of offers
 2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
      2.3.1 Write a program that can remove the offer objects that are not full-time
2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
      2.4.1 Write a program that can remove all the offers that are not from local
2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
     2.5.1 Write a program that can remove all the offers that does not have benefit
      and does not have PTO
2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
    2.6.1 Write a program that can remove all the offers that are not for SDET
2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
    2.7.1 Write a program that can remove all the offers that are offering
     less than 100K salary
 */