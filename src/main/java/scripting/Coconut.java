/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scripting;

/**
 *
 * @author v.grebenschikov
 */
public class Coconut {

    public Coconut() {
    }
    
    public void drinkThemBothUp(){
        System.out.println("You put the lime in the coconut...");
        System.out.println("and drink 'em both up...");
        System.out.println("You put the lime in the coconut...");
    }
    
    private Lime lime;

    public void setLime(Lime lime) {
        this.lime = lime;
    }
    
}
