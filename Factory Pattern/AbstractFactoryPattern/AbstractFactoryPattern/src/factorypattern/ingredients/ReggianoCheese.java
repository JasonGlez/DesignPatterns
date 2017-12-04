/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ingredients;

import factorypattern.ingredients.interfaces.Cheese;

/**
 *
 * @author jason
 */
public class ReggianoCheese implements Cheese {

    @Override
    public String toString() {
        return "Reggiano Cheese";
    }
}
