package chapter12;

import java.util.*;

public class CollectionsDemo {

    public static void main(String[] args) {
        setDemo();
    }


    public static void setDemo() {

        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");

        System.out.println(fruit.size());
        System.out.println(fruit);

        fruit.iterator();

        List fruitList = new ArrayList();
        fruitList.iterator();


        Queue fruit3 = new LinkedList();
        fruit3.iterator();

        Map fruitCalories = new HashMap();

    }
}
