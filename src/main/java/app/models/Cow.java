package app.models;

public class Cow extends Animal {
    public Cow(String name) {
        super(name);
    }

    @Override
    public String sing() {
        return "And on his farm he had a Cow, E-I-E-I-O\nWith a Moo Moo here\nand a Moo Moo there…\n";
    }
}
