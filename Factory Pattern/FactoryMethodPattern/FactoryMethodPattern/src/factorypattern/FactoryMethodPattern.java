/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

import factorypattern.store.PizzaStore;
import factorypattern.domain.factory.ChicagoPizzaFactory;
import factorypattern.domain.factory.NYPizzaFactory;
import factorypattern.domain.Pizza;

/**
 *
 * @author jason
 */
public class FactoryMethodPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaFactory();
        PizzaStore chicagoStore = new ChicagoPizzaFactory();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }

}
