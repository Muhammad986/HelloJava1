package ru.mirea.ikbo0819.pr1;
import java.lang.*;

public class DemoDog {
    public static void main(String[] args) {
        Dog c1 = new Dog("Jack",5);
        Dog c2 = new Dog("Bob");
        Dog c3 = new Dog(3);
        c3.setAge(1);
        System.out.println(c1);
        c1.intoHumanAge();
        c2.intoHumanAge();
        c3.intoHumanAge();
    }
}
