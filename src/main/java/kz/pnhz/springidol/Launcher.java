/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pnhz.springidol;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Locale;
import org.springframework.beans.factory.config.BeanPostProcessor;
import performers.Performer;
import performers.Instrumentalist;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import performers.AbsInstrumentalist;
import postProcessor.BeanCounter;
import postProcessor.Fuddifier;
import postProcessor.Rabbit;
import org.apache.commons.dbcp.BasicDataSource;
import foo.Course;
import foo.CourseFullEvent;
import instruments.Instrument;
import performers.PoeticJuggler;
import sheduling.CronTriggerBean;

/**
 *
 * @author v.grebenschikov
 */
public class Launcher {
    public static void Launch() throws SQLException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/spring-idol.xml");
        SpringIdolConfig sic = new SpringIdolConfig();
        sic.duke15().perform();
        sic.eddie().perform();
        
//        Performer duke = (Performer) ctx.getBean("duke");
//        duke.perform();
        
//        Instrumentalist instrumentalist = (Instrumentalist) ctx.getBean("eddie");
//        instrumentalist.perform();
////        Performer performer = (Performer) ctx.getBean("poeticDuke");
////        performer.perform();
////        Auditorium auditorium = (Auditorium) ctx.getBean("auditorium");
////        Instrumentalist instrumentalist = (Instrumentalist) ctx.getBean("kenny");
////        instrumentalist.perform();
////        Instrumentalist instrumentalist2 = (Instrumentalist) ctx.getBean("david");
////        instrumentalist2.perform();
////        Instrumentalist instrumentalist3 = (Instrumentalist) ctx.getBean("stevie");
////        instrumentalist3.perform();
////        AbsInstrumentalist instrumentalist4 = (AbsInstrumentalist) ctx.getBean("stevie2");
////        instrumentalist4.perform();

//        Rabbit rabbit = (Rabbit) ctx.getBean("bags");
//        rabbit.printDescription();

////        BeanCounter beanCounter = (BeanCounter) ctx.getBean("beanCounter");
////        BasicDataSource ds = (BasicDataSource) ctx.getBean("dataSource");
//        ds.getConnection();
        
////        Locale locale = Locale.GERMANY;
////        String text = ctx.getMessage("computer", new Object[0], locale);
////        System.out.println(text);
////        
////        Course course = (Course) ctx.getBean("course");
//        CourseFullEvent ce = new CourseFullEvent(this, course);
//        ctx.publishEvent(ce);
        
////        CronTriggerBean cronTrigger = (CronTriggerBean) ctx.getBean("cronTriggerBean");
////        System.out.println("cronTrigger.getBeanName(): " + cronTrigger.getBeanName());
////        
////        Instrumentalist kenny2 = (Instrumentalist) ctx.getBean("kenny2");
////        instrumentalist.perform();
////        Performer juggler = (Performer) ctx.getBean("duke");
////        juggler.perform();
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
