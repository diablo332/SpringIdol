/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package postProcessor;

/**
 *
 * @author Server
 */
public class Rabbit {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public void printDescription(){
        System.out.println(getDescription());
    }
}
