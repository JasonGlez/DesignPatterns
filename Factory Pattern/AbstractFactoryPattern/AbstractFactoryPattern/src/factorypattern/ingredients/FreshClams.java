/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern.ingredients;

import factorypattern.ingredients.interfaces.Clams;

/**
 *
 * @author jason
 */
public class FreshClams implements Clams {

    @Override
    public String toString() {
        return "Fresh Clams from Long Island Sound";
    }
}
