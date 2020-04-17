package pro.paullezin.patterns.strategy;

import pro.paullezin.patterns.strategy.model.Duck;
import pro.paullezin.patterns.strategy.model.MallardDuck;
import pro.paullezin.patterns.strategy.model.SelezenDuck;

public class View {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        Duck selezen = new SelezenDuck();
        selezen.display();
        selezen.performQuack();;
        selezen.performFly();
    }
}
