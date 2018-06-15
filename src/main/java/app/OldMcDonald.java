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
        this.animals = new Animal[3];
        this.animals[0] = new Cow("Cow");
        this.animals[1] = new Dog("Dog");
        this.animals[2] = new Duck("Duck");
    }

    public void sing() {
        for (int i = 0; i < animals.length; i++) {
            System.out.printf("Old McDonald had a farm, E-I-E-I-O%nAnd on his farm he had a %s, E-I-E-I-O%nWith a %s here%nand a %s there…%n",
                    this.animals[i].getName(), this.animals[i].sing(), this.animals[i].sing());
        }
    }

    public static void main(String[] args) {
        OldMcDonald oldMcDonald = new OldMcDonald();
        oldMcDonald.sing();
    }
}
