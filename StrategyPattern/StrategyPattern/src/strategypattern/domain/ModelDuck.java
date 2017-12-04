/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.domain;

import strategypattern.behaviors.FlyNoWay;
import strategypattern.behaviors.Quack;

/**
 *
 * @author jason
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyNoWay());
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
