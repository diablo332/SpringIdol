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
public class Sonnet29 implements Poem {

    private static String[] LINES = {
        "Test1",
        "Test2"};

    public Sonnet29() {
    }
    
    @Override
    public void recite() {
        for (int i = 0; i < LINES.length; i++) {
            System.out.println(LINES[i]);
        }
    }

}
