import Controller.Statistics;
import Model.*;
import View.CreateCharacter;

public class Main {
    public static void main(String[] args) {
        CreateCharacter createCharacter = new CreateCharacter();
        BasicCharacter basicCharacter = createCharacter.createCharacter();
        System.out.println(basicCharacter.toString());
    }
}