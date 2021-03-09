package test;

public class Cat extends Animal {

    private static int getNumberOfCats = 0;

    public Cat(String color) {
        super(color);
        getNumberOfCats++;
    }


    public static int getNumberOfCats() {
        return getNumberOfCats;
    }

    @Override
    public void makeSound() {
        System.out.println(color + " cat " + name + " says meow!");
    }
}
