package pro.paullezin.patterns.strategy.service;

import pro.paullezin.patterns.strategy.util.QuackBehavior;

public class Krya implements QuackBehavior {
    public void quack() {
        System.out.println("Krya krya krya");
    }
}
