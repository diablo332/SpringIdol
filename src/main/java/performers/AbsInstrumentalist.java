/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package performers;

import instruments.Instrument;

/**
 *
 * @author Server
 */
public abstract class AbsInstrumentalist implements Performer {

    public AbsInstrumentalist() {
    }


    @Override
    public void perform() {
        System.out.print("Playing " + song + " : ");
        getInstrument().play();
    }

    private String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    private Instrument instrument;

    public abstract Instrument getInstrument();

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }
    
}
