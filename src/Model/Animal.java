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


            setStrength(10);
            setHealthPoint(getLevel() * 20);

        }
    public void wyswietl(){
        System.out.println(getLevel()+" "+getStrength()+" "+getHealthPoint());
    }
}