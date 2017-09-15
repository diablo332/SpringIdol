/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package performers;

import kz.pnhz.springidol.MagicBox;

/**
 *
 * @author v.grebenschikov
 */
public class Magical implements Performer {

    private MagicBox magicBox;
    private String magicWords;

    public String getMagicWords() {
        return magicWords;
    }

    public void setMagicWords(String magicWords) {
        this.magicWords = magicWords;
    }

    public Magical() {
    }

    @Override
    public void perform() {
        System.out.println(getMagicWords());
        System.out.println("The magic box contains...");
        System.out.println(getMagicBox().getContents());
    }

    public MagicBox getMagicBox() {
        return magicBox;
    }

    public void setMagicBox(MagicBox magicBox) {
        this.magicBox = magicBox;
    }
}
