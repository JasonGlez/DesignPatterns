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
public class ChicagoPizzaIngredientRecipe implements PizzaIngredientRecipe {

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(), new Spinach(), new Eggplant()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}
