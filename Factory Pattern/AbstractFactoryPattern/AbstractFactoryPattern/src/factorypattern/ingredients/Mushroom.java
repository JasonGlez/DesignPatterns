/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ingredients;

import factorypattern.ingredients.interfaces.Veggies;

/**
 *
 * @author jason
 */
public class Mushroom implements Veggies {

    @Override
    public String toString() {
        return "Mushrooms";
    }
}
