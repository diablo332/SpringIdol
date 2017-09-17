/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propeditor;

import jdk.nashorn.internal.lookup.MethodHandleFactory;

/**
 *
 * @author Server
 */
public class PhoneEditor extends java.beans.PropertyEditorSupport {

    public void setAsText(String textValue) {
        String stripped = stripNonNumeric(textValue);

        String areaCode = stripped.substring(0, 3);
        String prefix = stripped.substring(3, 6);
        String number = stripped.substring(6);

        PhoneNumber phone = new PhoneNumber(areaCode, prefix, number);
        setValue(phone);
    }

    private String stripNonNumeric(String original) {
        StringBuffer allNumeric = new StringBuffer();
        for (int i = 0; i < original.length(); i++) {
            char c = original.charAt(i);
            if (Character.isDigit(c)) {
                allNumeric.append(c);
            }
        }
        return allNumeric.toString();
    }
}
