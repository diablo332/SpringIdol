/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pnhz.springidol;

import annotation.Configuration;
import org.springframework.context.annotation.Bean;
import performers.Instrumentalist;
import performers.Junggler;
import performers.Performer;
import performers.PoeticJuggler;

/**
 *
 * @author v.grebenschikov
 */
@Configuration
public class SpringIdolConfig {
    @Bean
    public Performer duke(){
        return new Junggler();
    }
    
    @Bean
    public Performer duke15(){
        return new Junggler(15);
    }
    
    @Bean
    public Performer kenny(){
        Instrumentalist kenny = new Instrumentalist();
        kenny.setSong("Jingle Bells");
        return kenny;
    }
    
    @Bean
    private Poem sonnet29(){
        return new Sonnet29();
    }
    
    @Bean
    public Performer poeticDuke(){
        return new PoeticJuggler(sonnet29());
    }
    
    @Bean
    public Instrumentalist eddie(){
        return new Instrumentalist();
    }
    
}
