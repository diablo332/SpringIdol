/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postProcessor;

import java.lang.reflect.Field;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 *
 * @author Server
 */
public class Fuddifier implements BeanPostProcessor {

    @Override
    public Object postProcessAfterInitialization(Object bean, String name) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        try {
            for (int i = 0; i < fields.length; i++) {
                if (fields[i].getType().equals(java.lang.String.class)) {
                    fields[i].setAccessible(true);
                    String original = (String) fields[i].get(bean);
                    fields[i].set(bean, fuddify(original));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String name) throws BeansException {
        return bean;
    }

    private Object fuddify(String original) {
        if (original == null) {
            return original;
        }
        return original.replaceAll("(r|l)", "w").replaceAll("(R|L)", "W");
    }

}
