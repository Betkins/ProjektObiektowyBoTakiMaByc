package Model;

public abstract class BasicCharacter {

    private int Level;
    private int HealthPoint;
    private Guild guild;
    private Perk perk;




    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getHealthPoint() {
        return HealthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        HealthPoint = healthPoint;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(getLevel())
                            .append(" ")
                            .append(getHealthPoint())
                            .toString();

    }


    public Guild getGuild() {
        return guild;
    }

    public void setGuild(Guild guild) {
        this.guild = guild;
    }

    public Perk getPerk() {
        return perk;
    }

    public void setPerk(Perk perk) {
        this.perk = perk;
    }
}