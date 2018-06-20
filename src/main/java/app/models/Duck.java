package app.models;

/**
 * Duck class extends the Animal class and all of it's logic.
 * Provides functionality to mimic the animal's song.
 */
public class Duck extends Animal {
    private static final String DUCK_SONG_LYRICS = "Quack Quack";
    private static final String DUCK_NAME = "Duck";

    public Duck() {
        super(DUCK_NAME);
    }

    /**
     * Method used to mimic the song the current type of animal sings.
     *
     * @return String value representing the song lyrics of the duck.
     */
    @Override
    public String sing() {
        return DUCK_SONG_LYRICS;
    }
}
