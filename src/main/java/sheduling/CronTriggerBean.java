/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sheduling;

import org.springframework.beans.factory.BeanNameAware;

/**
 *
 * @author v.grebenschikov
 */
public class CronTriggerBean extends CronTrigger implements BeanNameAware{
    private String beanName;

    public String getBeanName() {
        return beanName;
    }
    @Override
    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
    
    public void afterPropertiesSet(){
        if (getBeanName() == null) {
            setBeanName(this.beanName);
        }
    }

}
