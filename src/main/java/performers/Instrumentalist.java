/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package performers;

import instruments.Instrument;

/**
 *
 * @author v.grebenschikov
 */
public class Instrumentalist implements Performer {

    public Instrumentalist() {

    }

    @Override
    public void perform() {
        System.out.print("Playing " + song + " : ");
        instrument.play();
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    private Instrument instrument;

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
}
