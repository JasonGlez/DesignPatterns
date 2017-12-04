/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern.behaviors;

import strategypattern.interfaces.QuackBehavior;

/**
 *
 * @author jason
 */
public class MuteQuack implements QuackBehavior {
    
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
