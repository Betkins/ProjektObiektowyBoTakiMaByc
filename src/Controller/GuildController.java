package Controller;

import Model.BasicCharacter;
import Model.Perk;

import Model.Human;

import java.util.ArrayList;

public class GuildController {

    public void pickPerk(BasicCharacter basicCharacter, ArrayList<Perk> perks){

        for(Perk p : perks){
            if (p.getGuild()==basicCharacter.getGuild()){
                basicCharacter.setPerk(p);
                break;
            }
        }

    }

}
