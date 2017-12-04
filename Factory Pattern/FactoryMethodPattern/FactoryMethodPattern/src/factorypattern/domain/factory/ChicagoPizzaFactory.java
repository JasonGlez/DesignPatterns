/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.domain.factory;

import factorypattern.domain.ChicagoStyleCheesePizza;
import factorypattern.domain.ChicagoStyleClamPizza;
import factorypattern.domain.ChicagoStylePepperoniPizza;
import factorypattern.domain.ChicagoStyleVeggiePizza;
import factorypattern.domain.Pizza;
import factorypattern.store.PizzaStore;

/**
 *
 * @author jason
 */
public class ChicagoPizzaFactory extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        switch (item) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
