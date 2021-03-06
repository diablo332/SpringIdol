/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package performers;

import kz.pnhz.springidol.Poem;
import performers.Junggler;

/**
 *
 * @author v.grebenschikov
 */
public class PoeticJuggler extends Junggler {

    private Poem poem;

    public PoeticJuggler(Poem poem) {
        super();
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        this.poem = poem;
    }
    
    public void perform() {
        super.perform();
        System.out.println("While reciting ...");
        poem.recite();
    }
}
