package pro.paullezin.patterns.strategy.model;

import pro.paullezin.patterns.strategy.service.FlyWithWings;
import pro.paullezin.patterns.strategy.service.Krya;

public class SelezenDuck extends Duck {
    public SelezenDuck(){
        this.quackBehavior = new Krya();
        this.flyBehavior = new FlyWithWings();
    }
    public void display() {
        System.out.println("I'm beautiful selezen duck from Russia");
    }
}
