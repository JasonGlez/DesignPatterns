/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.factory;

import factorypattern.domain.CheesePizza;
import factorypattern.domain.PepperoniPizza;
import factorypattern.domain.ClamPizza;
import factorypattern.domain.VeggiePizza;
import factorypattern.domain.Pizza;

/**
 *
 * @author jason
 */
public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
            default:
                break;
        }
        return pizza;
    }
}
