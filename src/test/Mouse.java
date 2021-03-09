package test;

public class Mouse extends Animal{

    private static int getNumberOfMise = 0;

    public Mouse(String color) {
        super(color);
        getNumberOfMise++;
    }


    public static int getNumberOfMise() {
        return getNumberOfMise;
    }

    @Override
    public void makeSound() {
        System.out.println(color + " mouse " + name + " says pipi");
    }

}
