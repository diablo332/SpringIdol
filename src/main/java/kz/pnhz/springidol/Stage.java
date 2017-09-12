/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kz.pnhz.springidol;

/**
 *
 * @author v.grebenschikov
 */
public class Stage {
    private Stage(){
    }
    
    private static class StageSingletonHolder{
        static Stage instance = new Stage();
    }
    
    public static Stage getInstance(){
        return StageSingletonHolder.instance;
    }
}
