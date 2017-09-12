/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pnhz.springidol;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author v.grebenschikov
 */
public class OneManBand implements Performer {

    public OneManBand() {
    }

    @Override
    public void perform() {
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    private Collection<Instrument> instruments;

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
    
}
