package View;

import Model.Animal;
import Model.Guild;
import Model.Human;
import Model.Orc;

import java.util.Scanner;

public class ChooseGuild {
    public void ChooseGuild(Human human){
        Scanner scan = new Scanner(System.in);
        int wybor;
        do {
            System.out.println("Wybierz gildie");
            System.out.println("1 - Strażnik miejski");
            System.out.println("2 - Najemnik");
            System.out.println("3 - Mag Ognia");
            wybor = scan.nextInt();
            switch (wybor) {
                case 1:

                    human.setGuild(Guild.CITYGUARD);
                    break;

                case 2:

                    human.setGuild(Guild.MERCENARY);
                    break;
                case 3:

                    human.setGuild(Guild.FIREMAGE);
                    break;
                default:
                    human.setGuild(Guild.CITYGUARD);
            }
        }while (wybor < 1 && wybor > 3);
        }
    public void ChooseGuild(Orc orc){
        Scanner scan = new Scanner(System.in);
        int wybor;
        do {
            System.out.println("Wybierz rase orka ");
            System.out.println("1 - Wojownik GigaChad");
            System.out.println("2 - Scout BetaBankomat");
            wybor = scan.nextInt();
            switch (wybor) {
                case 1:

                    orc.setGuild(Guild.WARRIOR);
                    break;

                case 2:

                    orc.setGuild(Guild.SCOUT);

                    break;

                default:
                    orc.setGuild(Guild.WARRIOR);
            }
        }while (wybor < 1 && wybor > 2);
    }
    public void ChooseGuild(Animal animal){
        Scanner scan = new Scanner(System.in);
        int wybor;
        do {
            System.out.println("Wybierz typ zwierzecia");
            System.out.println("1 - agrysywny");
            System.out.println("2 - pasywny");

            wybor = scan.nextInt();
            switch (wybor) {
                case 1:

                    animal.setGuild(Guild.AGGRESIVE);
                    break;

                case 2:

                    animal.setGuild(Guild.PASSIVE);
                    break;

                default:
                    animal.setGuild(Guild.PASSIVE);
            }
        }while (wybor < 1 && wybor > 2);
    }
}
