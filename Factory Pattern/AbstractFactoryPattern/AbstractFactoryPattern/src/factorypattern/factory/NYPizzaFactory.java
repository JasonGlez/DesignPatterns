/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.factory;

import factorypattern.ingredients.NYPizzaIngredientRecipe;
import factorypattern.domain.CheesePizza;
import factorypattern.domain.ClamPizza;
import factorypattern.domain.PepperoniPizza;
import factorypattern.domain.VeggiePizza;
import factorypattern.store.PizzaStore;
import factorypattern.domain.Pizza;
import factorypattern.ingredients.interfaces.PizzaIngredientRecipe;

/**
 *
 * @author jason
 */
public class NYPizzaFactory extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {

        Pizza pizza = null;
        PizzaIngredientRecipe ingredientFactory = new NYPizzaIngredientRecipe();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("New York Style Pepperoni Pizza");
                break;
            default:
                break;
        }
        return pizza;
    }

}
