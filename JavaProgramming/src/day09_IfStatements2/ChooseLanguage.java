package day09_IfStatements2;

public class ChooseLanguage {

    public static void main(String[] args) {

        int selection = 4;
        String language;

        if (selection == 1) {
            language = "English";
            System.out.println(language + " - Hello, thank for your call");
        } else if (selection == 2) {
            language = "Spanish";
            System.out.println(language + " - Hola, gracias para llamar");
        } else if (selection == 3) {
            language = "Turkish";
            System.out.println(language + " - Merhaba, aradiginiz icin tesekkurler");
        } else if (selection == 4) {
            language = "Russian";
            System.out.println(language + " - Privet, spasibo za vash zvonok");
        }else{
            language = "French";
            System.out.println(language + " - Merci ,pour votre appel");
        }


        }

    }

/*
Create a class called ChooseLanguage, Given an integer variable named selection that has a number between 1~5, Write a program that can select the language based on the number that's given in selection and prints the following message:

		for 1: Hello, thanks for your call
		for 2: Hola, gracias para llamar
		for 3: Merhaba, aradiginiz icin tesekkurler
		for 4: Privet, spasibo za vash zvonok
		for 5: Merci ,pour votre appel

 */