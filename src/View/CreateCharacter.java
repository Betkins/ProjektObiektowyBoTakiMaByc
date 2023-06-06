package View;
import Controller.Statistics;
import Model.*;



import java.io.*;
import java.util.Scanner;

public class CreateCharacter {
    public BasicCharacter createCharacter() {

        int wybor = 0;
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
                    Human human = new Human(1);

                    return new Human(1);
                case 2:
                    return new Animal(1);
                case 3:
                    return new Orc(1);


            }
        } while (wybor < 1 && wybor > 3);
        return new Human (1);

    }
}



