package day29_ArraysList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator_RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); // 90 ~ 100
        gradeOfA.removeIf(p-> !(p>=90 && p<=100)); //to  remove all grades that not 90 ~ 100
        System.out.println("gradeOfA = " + gradeOfA); //gradeOfA = [100, 90]

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores); // 80 ~ 89
        gradeOfB.removeIf(p-> !(p>=80 && p<=89)); //to  remove all grades that not 80 ~ 89
        System.out.println("gradeOfB = " + gradeOfB);// gradeOfB = [85, 85]

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores); // 70 ~ 79
        gradeOfC.removeIf(p-> !(p>=70 && p<=79)); //to  remove all grades that not 70 ~ 79
        System.out.println("gradeOfC = " + gradeOfC);// gradeOfC = [75, 73, 73]

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores); // 60 ~ 69
        gradeOfD.removeIf(p-> !(p>=60 && p<=69)); //to  remove all grades that not 60 ~ 69
        System.out.println("gradeOfD= " + gradeOfD);// gradeOfD= [65]



        ArrayList<Integer> gradeOfF = new ArrayList<>(scores); // 0 ~ 59
        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);

        System.out.println("gradeOfF = " + gradeOfF); //gradeOfF = [55, 45, 35, 47]

        System.out.println("Total Number of grade A: "+ gradeOfA.size());
        System.out.println("Total Number of grade B: "+ gradeOfB.size());
        System.out.println("Total Number of grade C: "+ gradeOfC.size());
        System.out.println("Total Number of grade D: "+ gradeOfD.size());
        System.out.println("Total Number of grade F: "+ gradeOfF.size());


    }
    
}
/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        Write a program that can count the total numbers of grade A, B, C, D and F
 */