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
public interface ControleRemoto {
    
    public void mudarCanal(int canal);
    public void aumentarVolume() throws TratarVolume;
    public void diminuirVolume() throws TratarVolume;
    
}
