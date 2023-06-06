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
        setInteligence(10);
        setDextirity(10);
        setStrength(10);
        setHealthPoint(getLevel()*10);

    }
    public void wyswietl(){
        System.out.println(getLevel()+" "+getStrength()+" "+getDextirity()+" "+getInteligence()+" "+getHealthPoint());
    }
}
