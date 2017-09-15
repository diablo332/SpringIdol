/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pnhz.springidol;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

/**
 *
 * @author v.grebenschikov
 */
public class TigerReplacer implements MethodReplacer{

    @Override
    public Object reimplement(Object target, Method method, Object[] args) throws Throwable {
        return "A ferocious tiger";
    }

    
}
