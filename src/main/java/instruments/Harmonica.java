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
public class Harmonica implements Instrument{

    public Harmonica() {
    }

    @Override
    public void play() {
        System.out.println("Harmonica song");
    }
    
}
