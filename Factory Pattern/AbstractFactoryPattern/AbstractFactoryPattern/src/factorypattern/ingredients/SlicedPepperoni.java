/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ingredients;

import factorypattern.ingredients.interfaces.Pepperoni;

/**
 *
 * @author jason
 */
public class SlicedPepperoni implements Pepperoni {

    @Override
    public String toString() {
        return "Sliced Pepperoni";
    }
}
