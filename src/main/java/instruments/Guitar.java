/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instruments;

import org.springframework.stereotype.Component;

/**
 *
 * @author v.grebenschikov
 */
@StringedInstrument
@Component
public class Guitar implements Instrument {

    public Guitar() {
    }

    @Override
    public void play() {
        System.out.println("Guitar song");
    }
    
}
