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
public class Instrumentalist implements Performer {

    @Override
    public void perform() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String song;

    public Instrumentalist() {
        System.out.println("Playing " + song + " : ");
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    private String Instrument;

    public String getInstrument() {
        return Instrument;
    }

}
