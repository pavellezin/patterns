package pro.paullezin.patterns;

import pro.paullezin.patterns.strategy.model.Duck;
import pro.paullezin.patterns.strategy.model.MallardDuck;

public class View {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
