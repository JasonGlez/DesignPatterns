/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decoratorpattern.domain;

/**
 *
 * @author jason
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf Coffee";
    }
    
    @Override
    public double cost() {
        return 1.05;
    }
    
}
