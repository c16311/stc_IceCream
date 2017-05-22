/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IceCream;

/**
 *
 * @author c16311
 */
public class Main {
    public static void main(String[] args){
        IceCreamMixer ice1 = IceCreamMixer.getInstance();
        IceCreamMixer ice2 = IceCreamMixer.getInstance();
        IceCreamMixer ice3 = IceCreamMixer.getInstance();
       
        ice1.fill();
        ice2.fill();
        ice1.mixer();
        ice1.drain();
        
        ice2.fill();
        ice2.mixer();
        ice3.mixer();
        ice2.drain();
        
        ice3.fill();
        ice3.mixer();
        ice3.drain();
    } 
}
