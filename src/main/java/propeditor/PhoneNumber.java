/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package propeditor;

/**
 *
 * @author Server
 */
class PhoneNumber {
    private String areaCode;
    private String prefix;
    private  String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String areaCode, String prefix, String number) {
        this.areaCode = areaCode;
        this.prefix = prefix;
        this.number = number;
    }
    
    
}
