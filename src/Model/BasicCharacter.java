package Model;

public abstract class BasicCharacter {

    private int Level;
    private int HealthPoint;


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



}