/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package performers;

import performers.Performer;
import instruments.Instrument;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 *
 * @author v.grebenschikov
 */
public class OneManBand implements Performer {

    private String someNonNullProperty;

    public void setSomeNonNullProperty(String someNonNullProperty) {
        this.someNonNullProperty = someNonNullProperty;
    }
//    private Collection<Instrument> instruments;
//    private Map<String, Instrument> instruments;
    private Properties instruments;

    public OneManBand() {
    }

    @Override
    public void perform() {
//        for (Instrument instrument : instruments) {
//            instrument.play();
//        }

//        for (Object key : instruments.keySet()) {
//            System.out.print(key + " : ");
//            Instrument instrument = instruments.get(key);
//            instrument.play();
//        }
        for (Object key : instruments.keySet()) {
            System.out.print(key + " : ");
            String song = (String) instruments.get(key);
            System.out.println(song);
        }
    }

    //    public void setInstruments(Map<String, Instrument> instruments) {
    //        this.instruments = instruments;
    //    }
    public void setInstruments(Properties instruments) {
        this.instruments = instruments;
    }

}
