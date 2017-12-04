/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.store;

import factorypattern.domain.Pizza;

/**
 *
 * @author jason
 */
public abstract class PizzaStore {

    //Factory method
    protected abstract Pizza createPizza(String type);
    
    public final Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    
}
