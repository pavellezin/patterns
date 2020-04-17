package pro.paullezin.patterns.strategy;

import pro.paullezin.patterns.strategy.model.*;

public class View {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        mallard.swim();
        Duck selezen = new SelezenDuck();
        selezen.display();
        selezen.performQuack();
        selezen.performFly();
        selezen.swim();
    }
}
