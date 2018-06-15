package app.models;

/**
 * Cow class extends the Animal class and all of it's logic.
 * Provides functionality to mimic the animal's song.
 */
public class Cow extends Animal {
    private static final String COW_SONG_LYRICS = "Moo Moo";

    public Cow(String name) {
        super(name);
    }

    /**
     * Method used to mimic the song the current type of animal sings.
     *
     * @return String value representing the song lyrics of the cow.
     */
    @Override
    public String sing() {
        return COW_SONG_LYRICS;
    }
}
