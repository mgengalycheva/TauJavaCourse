package chapter10;

public class Zoo {

    public static void main(String args[]) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();

        // polymorphizm
        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();



    }


}
