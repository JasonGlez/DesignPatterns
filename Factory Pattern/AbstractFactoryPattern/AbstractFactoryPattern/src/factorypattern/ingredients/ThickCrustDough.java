/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ingredients;

import factorypattern.ingredients.interfaces.Dough;

/**
 *
 * @author jason
 */
public class ThickCrustDough implements Dough {

    @Override
    public String toString() {
        return "ThickCrust style extra thick crust dough";
    }
}
