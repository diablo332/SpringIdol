/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package performers;

/**
 *
 * @author v.grebenschikov
 */
public class Vocalist implements Performer {

    String song;

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    @Override
    public void perform() {
        System.out.print("Playing " + song + " : ");
    }

}
