package View;
import Controller.Statistics;
import Model.*;



import java.io.*;
import java.util.Scanner;

public class CreateCharacter {
    public BasicCharacter createCharacter() {

        int wybor = 0;
        Statistics stats = new Statistics();
        Scanner scan = new Scanner(System.in);
        do {
            Statistics statistics = new Statistics();
            System.out.println("Wybierz rase swojej postaci: ");
            System.out.println("1 - czlowiek");
            System.out.println("2 - zwierze");
            System.out.println("3 - ork");
            wybor = scan.nextInt();
            switch (wybor){
                case 1:
                    Human human = new Human(chooseLevel());
                    stats.PrepareCharacter(human);
                    return human;

                case 2:
                    Animal animal = new Animal(chooseLevel());
                    stats.PrepareCharacter(animal);
                    return animal;
                case 3:
                    Orc orc = new Orc(chooseLevel());
                    stats.PrepareCharacter(orc);
                    return orc;


            }
        } while (wybor < 1 && wybor > 3);
        return new Human (1);

    }
    private int chooseLevel(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj poziom byku ");
        return scan.nextInt();
    }
}



