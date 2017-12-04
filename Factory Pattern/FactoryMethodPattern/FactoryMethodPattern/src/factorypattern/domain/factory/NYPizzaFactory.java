/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.domain.factory;

import factorypattern.domain.NYStyleCheesePizza;
import factorypattern.domain.NYStyleClamPizza;
import factorypattern.domain.NYStylePepperoniPizza;
import factorypattern.domain.NYStyleVeggiePizza;
import factorypattern.domain.Pizza;
import factorypattern.store.PizzaStore;

/**
 *
 * @author jason
 */
public class NYPizzaFactory extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
    
}
