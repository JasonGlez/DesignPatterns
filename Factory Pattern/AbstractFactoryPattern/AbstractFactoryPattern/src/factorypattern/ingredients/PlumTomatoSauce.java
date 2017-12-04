/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ingredients;

import factorypattern.ingredients.interfaces.Sauce;

/**
 *
 * @author jason
 */
public class PlumTomatoSauce implements Sauce {

    @Override
    public String toString() {
        return "Tomato sauce with plum tomatoes";
    }
}
