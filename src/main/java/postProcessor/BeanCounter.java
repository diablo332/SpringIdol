/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postProcessor;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 *
 * @author v.grebenschikov
 */
public class BeanCounter implements BeanFactoryPostProcessor {

    private Logger LOGGER = Logger.getLogger(BeanCounter.class);

    public BeanCounter() {
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        LOGGER.debug("BEAN COUNT: "
                + factory.getBeanDefinitionCount());
        System.out.println("BEAN COUNT: "
                + factory.getBeanDefinitionCount());
    }

}
