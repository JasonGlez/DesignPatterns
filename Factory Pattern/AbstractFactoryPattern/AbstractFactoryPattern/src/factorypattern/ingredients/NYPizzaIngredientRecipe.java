/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ingredients;

import factorypattern.ingredients.interfaces.Cheese;
import factorypattern.ingredients.interfaces.Clams;
import factorypattern.ingredients.interfaces.Dough;
import factorypattern.ingredients.interfaces.Pepperoni;
import factorypattern.ingredients.interfaces.Sauce;
import factorypattern.ingredients.interfaces.Veggies;
import factorypattern.ingredients.interfaces.PizzaIngredientRecipe;

/**
 *
 * @author jason
 */
public class NYPizzaIngredientRecipe implements PizzaIngredientRecipe {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}
