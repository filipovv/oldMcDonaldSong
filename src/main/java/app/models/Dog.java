package app.models;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public String sing() {
        return "And on his farm he had a Dog, E-I-E-I-O\nWith a Woof Woof here\nand a Woof Woof there…\n";
    }
}
