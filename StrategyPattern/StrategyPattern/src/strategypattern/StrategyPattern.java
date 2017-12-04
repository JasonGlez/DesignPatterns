/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import strategypattern.domain.Duck;
import strategypattern.domain.MallardDuck;
import strategypattern.domain.ModelDuck;
import strategypattern.behaviors.FlyRocketPowered;

/**
 *
 * @author jason
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        System.out.println("---------------------------------");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        System.out.println("---------Set the fly behavior--------");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
    
}
