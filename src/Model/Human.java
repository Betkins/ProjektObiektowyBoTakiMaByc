package Model;

import Controller.Istatistical;

public class Human extends BasicCharacter implements Istatistical {

    private int strength;
    private int dextirity;
    private int inteligence;

    public Human(int Level) {
        setLevel(Level);

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

    public int getInteligence() {
        return inteligence;
    }

    public void setInteligence(int inteligence) {
        this.inteligence = inteligence;
    }

    @Override
    public void CalculateStatistic() {
        setInteligence(10+getLevel());
        setDextirity(10*getLevel());
        setStrength(10*getLevel());
        setHealthPoint(getLevel()+getInteligence()+getStrength()+getDextirity());

    }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("Level:")
                .append(getLevel())
                .append(" \nHP:")
                .append(getHealthPoint())
                .append(" \nSTR:")
                .append(getStrength())
                .append(" \nDEX:")
                .append(getDextirity())
                .append(" \nINT:")
                .append(getInteligence())
                .toString();
    }
}
