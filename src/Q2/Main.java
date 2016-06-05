/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

/**
 *
 * @author arthurcvm
 */
public class Main {
    public static void main(String args[]) throws TratarVolume{
        TV_LED tvLed = new TV_LED("Samsung", 21);
        
        for(int i=0;i<110;i++){
            tvLed.aumentarVolume();
        }
        System.out.println(tvLed.getVolume());
        
        for(int i=0;i<110;i++){
            tvLed.diminuirVolume();
        }
        System.out.println(tvLed.getVolume());
    }    
}
