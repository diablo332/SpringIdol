/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instruments;

/**
 *
 * @author v.grebenschikov
 */
public class Cymbal implements Instrument{

    public Cymbal() {
    }

    @Override
    public void play() {
        System.out.println("Cymbal song");
    }
    
}
