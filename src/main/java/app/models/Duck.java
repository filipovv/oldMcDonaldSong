package app.models;

public class Duck extends Animal {
    public Duck(String name) {
        super(name);
    }

    @Override
    public String sing() {
        return "And on his farm he had a Duck, E-I-E-I-O\nWith a Quack Quack here\nand a Quack Quack there…\n";
    }
}
