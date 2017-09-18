/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 *
 * @author v.grebenschikov
 */
public class RefreshListener implements ApplicationListener{

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Event: " + event.toString());
    }
    
}
