package Model;

public class Perk {
    private String PerkName;
    private Guild guild;

    public String getPerkName() {
        return PerkName;
    }

    public void setPerkName(String perkName) {
        PerkName = perkName;
    }

    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Perk(String PerkName,Guild guild){
        setPerkName(PerkName);
        setGuild(guild);
    }
}
