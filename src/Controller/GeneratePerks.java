package Controller;
import Model.Guild;
import Model.Perk;
import java.util.ArrayList;

public class GeneratePerks {

    public ArrayList<Perk> GeneratePerks(){
        ArrayList<Perk> Perks = new ArrayList<>();
        Perks.add(new Perk("Kusznik", Guild.CITYGUARD));
        Perks.add(new Perk("Lucznik", Guild.MERCENARY));
        Perks.add(new Perk("Kula Ognia", Guild.FIREMAGE));
        Perks.add(new Perk("Silne uderzenie", Guild.WARRIOR));
        Perks.add(new Perk("Szybki bieg", Guild.SCOUT));
        Perks.add(new Perk("Warcz", Guild.AGGRESIVE));
        Perks.add(new Perk("Milcz", Guild.PASSIVE));
        return Perks;

    }
}
