package test;

public abstract class Animal {

    String name;
    String color;
    String gender;
    private static int numberOfAnimals = 0;

    public Animal(String color) {
        numberOfAnimals++;
        this.name = "";
        this.color = color;
    }

    public Animal(String color, String name) {
        numberOfAnimals++;
        this.name = name;
        this.color = color;
    }

    public static int getNumberOfAnimals() {
        return numberOfAnimals;
    }

    public void setName(String name) {
        if (!this.name.equals("")) {
            throw new RuntimeException("The name already given");
        } else
        this.name = name;
    }

    public abstract void makeSound();



}
