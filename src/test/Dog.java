package test;

public class Dog extends Animal{

    private static int numberOfDogs = 0;

    public Dog(String color) {
        super(color);
        numberOfDogs++;
    }

    public Dog(String color, String name) {
        super(color, name);
        numberOfDogs++;
    }

    public static int getNumberOfDogs() {
        return numberOfDogs;
    }

    @Override
    public void makeSound() {
        System.out.println(color + " dog " + name + " says woff!");
    }

    public void makeJump() {
        System.out.println("I am a " + name + ", I like jumping");
    }

}
