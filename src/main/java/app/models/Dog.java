package app.models;

/**
 * Dog class extends the Animal class and all of it's logic.
 * Provides functionality to mimic the animal's song.
 */
public class Dog extends Animal {
    private static final String DOG_SONG_LYRICS = "Woof Woof";
    private static final String DOG_NAME = "Dog";

    public Dog() {
        super(DOG_NAME);
    }

    /**
     * Method used to mimic the song the current type of animal sings.
     *
     * @return String value representing the song lyrics of the dog.
     */
    @Override
    public String sing() {
        return DOG_SONG_LYRICS;
    }
}