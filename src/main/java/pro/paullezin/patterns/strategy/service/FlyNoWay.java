package pro.paullezin.patterns.strategy.service;

import pro.paullezin.patterns.strategy.util.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
