package Model;

import Controller.Istatistical;

public class Orc extends BasicCharacter implements Istatistical {

    private int strength;
    private int dextirity;


    public Orc(int Level) {
        setLevel(Level);

    }


    public void CalculateStatistic() {

        setDextirity(10+getLevel());
        setStrength(getLevel()*20);
        setHealthPoint(getLevel() * 20 + getStrength());

    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDextirity() {
        return dextirity;
    }

    public void setDextirity(int dextirity) {
        this.dextirity = dextirity;
    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        return stringBuilder.append("level: ")
                .append(getLevel())
                .append(" \nHP:")
                .append(getHealthPoint())
                .append(" \nSTR:")
                .append(getStrength())
                .append(" \nDEX:")
                .append(getDextirity())
                .toString();
    }
}