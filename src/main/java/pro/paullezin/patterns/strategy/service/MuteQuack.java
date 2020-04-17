package pro.paullezin.patterns.strategy.service;

import pro.paullezin.patterns.strategy.util.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
