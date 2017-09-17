/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pnhz.springidol;

import org.springframework.beans.factory.config.BeanPostProcessor;
import performers.Performer;
import performers.Instrumentalist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.AbsInstrumentalist;
import postProcessor.Fuddifier;
import postProcessor.Rabbit;

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
        Instrumentalist instrumentalist = (Instrumentalist) ctx.getBean("kenny");
        instrumentalist.perform();
        Instrumentalist instrumentalist2 = (Instrumentalist) ctx.getBean("david");
        instrumentalist2.perform();
        Instrumentalist instrumentalist3 = (Instrumentalist) ctx.getBean("stevie");
        instrumentalist3.perform();
        AbsInstrumentalist instrumentalist4 = (AbsInstrumentalist) ctx.getBean("stevie2");
        instrumentalist4.perform();
        Rabbit rabbit = (Rabbit) ctx.getBean("bags");
        rabbit.printDescription();
//        Instrumentalist carl = (Instrumentalist) ctx.getBean("carl");
//        carl.perform();
//        
//        Performer hank = (Performer) ctx.getBean("hank");
//        hank.perform();
//        
//        Performer magical = (Performer) ctx.getBean("harry");
//        magical.perform();
    }
}
