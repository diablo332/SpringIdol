/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pnhz.springidol;

/**
 *
 * @author v.grebenschikov
 */
public class Junggler implements Performer{
    private int beanBags = 3;

    public Junggler() {
    }
    
    public Junggler(int beanBags) {
        this.beanBags = beanBags;
    }
    
    @Override
    public void perform() {
        System.out.println("JUGGLING " + beanBags + " BEANBAGS");
    }
    
}
