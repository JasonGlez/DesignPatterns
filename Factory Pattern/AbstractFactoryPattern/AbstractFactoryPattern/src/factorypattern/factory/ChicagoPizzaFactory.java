/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.factory;

import factorypattern.ingredients.ChicagoPizzaIngredientRecipe;
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
public class ChicagoPizzaFactory extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientRecipe ingredientFactory = new ChicagoPizzaIngredientRecipe();

        switch (item) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("Chicago Style Cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("Chicago Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("Chicago Style Clam Pizza");
                break;
            case "pepperoni":
                pizza = new PepperoniPizza(ingredientFactory);
                pizza.setName("Chicago Style Pepperoni Pizza");
                break;
            default:
                break;
        }
        return pizza;
    }
}
