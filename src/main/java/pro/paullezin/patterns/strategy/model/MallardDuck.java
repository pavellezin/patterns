package pro.paullezin.patterns.strategy.model;

import pro.paullezin.patterns.strategy.service.*;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
