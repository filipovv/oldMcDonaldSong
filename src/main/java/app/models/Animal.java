package app.models;

/**
 * Animal abstract class holds base information about all child
 * classes witch are meant to inherit this class.
 */
public abstract class Animal {
    private String name;

    /**
     * Package-private constructor for all animals.
     *
     * @param name String value to be set as the animal's name.
     */
    protected Animal(String name) {
        this.setName(name);
    }

    /**
     * Abstract method meant to be inherited by the child classes.
     * Used to print the song for each animal.
     *
     * @return String value representing the song the animal sings.
     */
    public abstract String sing();

    /**
     * Getter method for the animal's name.
     *
     * @return String value representing the name of the animal.
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for the animal's name.
     *
     * @param name String value to be set as the name of the animal.
     */
    private void setName(String name) {
        this.name = name;
    }
}
