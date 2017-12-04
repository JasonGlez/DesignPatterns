/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.domain;

import factorypattern.ingredients.interfaces.PizzaIngredientRecipe;

/**
 *
 * @author jason
 */
public class VeggiePizza extends Pizza {

    PizzaIngredientRecipe ingredientFactory;

    public VeggiePizza(PizzaIngredientRecipe ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}
