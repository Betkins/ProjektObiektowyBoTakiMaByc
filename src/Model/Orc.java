package Model;

import Controller.Istatistical;

public class Orc extends BasicCharacter implements Istatistical {

    private int strength;
    private int dextirity;


    public Orc(int Level) {
        setLevel(Level);

    }


    public void CalculateStatistic() {

        setDextirity(10);
        setStrength(10);
        setHealthPoint(getLevel() * 20);

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
    public void wyswietl() {
        System.out.println(getLevel() + " " + getStrength() + " " + getDextirity()+ " " + getHealthPoint());
    }
}