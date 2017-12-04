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
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;
    
    @Override
    public abstract String getDescription();
    
    @Override
    public Size getSize() {
        return beverage.getSize();
    }
}
