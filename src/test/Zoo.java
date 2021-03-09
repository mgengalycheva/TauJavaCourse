package test;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static void main (String args[]) {

        Animal jerry = new Dog("black");
        Animal kerry = new Cat("white");
        Animal toto = new Mouse("purple");

        Dog rich = new Dog("green");

        Animal colin = new Dog("ginger", "Colin");

        List<Animal> smallZoo = new ArrayList();
        smallZoo.add(jerry);
        smallZoo.add(kerry);
        smallZoo.add(new Dog("brown"));
        smallZoo.add(toto);
        smallZoo.add(colin);
        smallZoo.add(rich);

        System.out.println("===================");
        smallZoo.forEach(Animal::makeSound);

        jerry.setName("Jerry");
        kerry.setName("Kerry");
        toto.setName("Toto");
        rich.setName("Rich");

        smallZoo.get(2).setName("Wolf");

        System.out.println("===================");

        smallZoo.forEach(Animal::makeSound);

        System.out.println("===================");
        ((Dog)jerry).makeJump();
        rich.makeJump();

        System.out.println("number of animals: " + Animal.getNumberOfAnimals());
        System.out.println("number of dogs: " + Dog.getNumberOfDogs());
        System.out.println("number of cats: " + Cat.getNumberOfCats());
        System.out.println("number of mise: " + Mouse.getNumberOfMise());

        //kerry.setName("Richard");

    }

}
