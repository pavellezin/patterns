package pro.paullezin.patterns.strategy.service;

import pro.paullezin.patterns.strategy.util.QuackBehavior;

public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
