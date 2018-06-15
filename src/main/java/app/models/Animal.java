package app.models;

public abstract class Animal {
    private String name;

    Animal(String name) {
        this.setName(name);
    }

    public abstract String sing();

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
