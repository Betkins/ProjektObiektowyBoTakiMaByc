package Model;

import Controller.Istatistical;

public class Animal extends BasicCharacter implements Istatistical {

    private int strength;


    public Animal(int Level) {
        setLevel(Level);


    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
        public void CalculateStatistic() {


            setStrength(getLevel()*5);
            setHealthPoint(getLevel()+2*getStrength());

        }
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append("\nLevel:")
                .append(getLevel())
                .append(" \nHP:")
                .append(getHealthPoint())
                .append(" \nSTR:")
                .append(getStrength())
                .toString();
    }
}