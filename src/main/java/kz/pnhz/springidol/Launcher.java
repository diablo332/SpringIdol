/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pnhz.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author v.grebenschikov
 */
public class Launcher {
    public static void Launch() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring-idol.xml");
        
        Performer performer = (Performer) ctx.getBean("poeticDuke");
        performer.perform();
        Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");
    }
}