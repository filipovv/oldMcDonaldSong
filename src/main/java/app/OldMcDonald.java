package app;

import app.models.Animal;
import app.models.Cow;
import app.models.Dog;
import app.models.Duck;

/**
 * The OldMcDonald program implements an application that creates
 * a farm with a fixed number of animals in it and provides a
 * method to compile the Old McDonald song's lyrics and print it on the console.
 */
public class OldMcDonald {
    private Animal[] animals;

    public OldMcDonald() {
        this.animals = new Animal[]{new Cow(), new Dog(), new Duck()};
    }

    /**
     * Method used to print the lyrics to the Old McDonald song to all the animals added to the application.
     */
    public void sing() {
        for (Animal animal : animals) {
            System.out.printf("Old McDonald had a farm, E-I-E-I-O%nAnd on his farm he had a %s, E-I-E-I-O%nWith a %s here%nand a %s there…%n",
                    animal.getName(), animal.sing(), animal.sing());
        }
    }

    public static void main(String[] args) {
        OldMcDonald oldMcDonald = new OldMcDonald();
        oldMcDonald.sing();
    }
}
