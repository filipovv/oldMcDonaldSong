package app;

import app.models.Animal;
import app.models.Cow;
import app.models.Dog;
import app.models.Duck;

public class OldMcDonald {
    private Animal[] animals;

    // Fixed farm size
    public OldMcDonald() {
        this.animals = new Animal[3];
        this.animals[0] = new Cow("Penka");
        this.animals[1] = new Dog("Ralph");
        this.animals[2] = new Duck("Gosho");
    }

    public void sing() {
        for (int i = 0; i < animals.length; i++) {
            System.out.println(
                    "Old McDonald had a farm, E-I-E-I-O\n"+ animals[i].sing()
            );
        }
    }

    public static void main(String[] args) {
        OldMcDonald oldMcDonald = new OldMcDonald();
        oldMcDonald.sing();
    }
}
